<?php
require_once '1.php';
$conn = new mysqli($servername, $username, $password, $database);
if($conn->connect_error) die("Connection failed: " . $conn->connect_error);

$query = 'SELECT * FROM student';
$result = $conn->query($query);

$row = $result -> num_rows;

for($i = 0; $i < $row; ++$i) {
    $result -> data_seek($i);
    echo 'ID: ' . $result->fetch_assoc()['id'] . '<br>';
    $result -> data_seek($i);
    echo 'Name: ' . $result->fetch_assoc()['name'] . '<br>';
    $result -> data_seek($i);
    echo 'Age: ' . $result->fetch_assoc()['age'] . '<br>';
    $result -> data_seek($i);
    echo 'Address: ' . $result->fetch_assoc()['address'] . '<br>';
    $result -> data_seek($i);
    echo 'Telephone: ' . $result->fetch_assoc()['telephone'] . '<br>';
}

$result->close();
$conn->close();
?>