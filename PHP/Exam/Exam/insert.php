<?php
require_once '1.php';

$conn = mysqli_connect($servername,$username,$password,$database);
if(!$conn) die(mysqli_connect_error());

$name = $_REQUEST['name'];
$age = $_REQUEST['age'];
$address = $_REQUEST['address'];
$telephone = $_REQUEST['telephone'];

$query = "Insert into student(name,age,address,telephone) values 
                                                       ('$name',$age,'$address','$telephone')";


$result = mysqli_query($conn,$query);
if(!$result) die ("insert failed");

echo "Inserted successfully";

mysqli_close($conn);
require_once '2.php';
?>