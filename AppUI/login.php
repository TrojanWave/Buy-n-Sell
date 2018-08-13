<?php
session_start();
require_once('dbconfig.php');

    $email = $_GET['em'];
    $pwd = $_GET['pwd'];

    $sqlLogin = "SELECT * FROM users WHERE email = '$email'";
    $resultLogin = $conn->query($sqlLogin);

    if ($resultLogin->num_rows > 0){
        while ($rowLogin = $resultLogin -> fetch_accoc()) {
            $loginPwd = $rowLogin["pwd"];

            if ($pwd == $loginPwd) {
                echo "Login Succesful";
            } else {
                echo "Login Failed";
            }

        }
    }
?>
