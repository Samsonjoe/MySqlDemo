<?php
require "conn.php";
$user_name ="123";
$user_pass = "123";
$mysql_qry = "select * from employee_data where username like '$user_name'and password = '$user_pass' " ;

$result = mysqli_query($conn, $mysql_qry);
if (mysqli_num_rows($result) > 0) {
	# code...
	echo "login successful";
}
else{
		echo "login  not successful";
}
?>