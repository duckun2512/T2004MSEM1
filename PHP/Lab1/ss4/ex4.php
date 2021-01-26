<?php
error_reporting(0);
$a = $_POST["empid"];
$b = $_POST["name"];
$c = $_POST["dept"];
$d = $_POST["email"];
echo "Your personal details";
echo "<br><br>";
echo "EMPID: $a <br>";
echo "Name: $b <br>";
echo "Department Name: $c <br>";
echo "Email: $d <br>";
?>