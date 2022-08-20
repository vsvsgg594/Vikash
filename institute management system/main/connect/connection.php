<?php
$server='localhost';
$username='root';
$password='';
$database='instittute';
$conn=mysqli_connect($server,$username,$password,$database);
if($conn)
{
  //  echo"connection establish";//
}
else
{
    echo"connectioin faield";
}
?>