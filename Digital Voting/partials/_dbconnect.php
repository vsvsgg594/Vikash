<?php

$server='localhost';
$uname='root';
$pass='';
$database='digital_voting';

$conn=mysqli_connect($server, $uname, $pass, $database);

if($conn)
{
    // echo"connected";
}
else
{
    die('soory, could not connected ');
}

?>