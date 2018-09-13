<?php
require_once('db/dbconn.php');

  $sql_catagories = "SELECT * FROM ad_catagories";
  $result_catagories = $conn->query($sql_catagories);


 ?>
