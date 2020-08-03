<?php
$db_name = "employee101";
$mysql_username = "root";
$mysql_password = "";
$servername = "localhost";
$conn = mysqli_connect($servername, $mysql_username, $mysql_password, $db_name);
if ($conn) {
	# code...
	echo "Connection success";
}
else{
	echo "Connection Not success";
}
?>