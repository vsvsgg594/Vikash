<?php 

$server='localhost';
$uname='root';
$password='';
$database='portfolio';
$conn=mysqli_connect($server,$uname,$password,$database);
if($conn)
{
   $cname=$_POST['cname'];
   $job=$_POST['job'];
   $location=$_POST['location'];
   $mobile=$_POST['mobile'];
   $email=$_POST['email'];
   $date=$_POST['date'];
  // echo $job;
  $sql="INSERT INTO `company`(`comapny_name`,`job_title`,`location`,`mobile`,`email`,`date`) VALUES ('$cname','$job','$location','$mobile','$email','$date')";
  $result=mysqli_query($conn,$sql);
  if($result)
  {
      echo"succesfully conneted";
      header('location:../html/hire.html');
      
  }
  



}
else
{
    echo"connection faied";
}
?>