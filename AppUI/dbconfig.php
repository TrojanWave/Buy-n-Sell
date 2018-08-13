<?php
$servername = "182.50.132.38";
$username = "BuynSellDb";
$password = "Heshani@143";
$dbname = "BuynSellDatabase";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>
