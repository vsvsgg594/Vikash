<?php 

$server='localhost';
$uname='root';
$password='';
$database='portfolio';
$conn=mysqli_connect($server,$uname,$password,$database);
if($conn)
{
    $name=$_POST['name'];
    $mobile=$_POST['mobile'];
    $email=$_POST['email'];
    $password=$_POST['passwd'];
    $address=$_POST['address'];

    // echo"$name $mobile $email $password $address";
    $sql="INSERT INTO `info`(`name`, `mobile`, `emial`, `passw`, `address`, `date`) VALUES ('$name', '$mobile', '$email', '$password', '$address', current_timestamp())";

    $result=mysqli_query($conn, $sql);
    if($result)
    {
        echo"Successfully registered !";
        header('location: ../index.html');
    }


}
else
{
    echo "connection does not establish";
}
?>