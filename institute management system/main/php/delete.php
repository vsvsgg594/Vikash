<?php
include "../connect/connection.php";
if(isset($_GET['deleteid']))
{
    $id=$_GET['deleteid'];
    $sql="delete from `student` where s_no=$id";
    $result=mysqli_query($conn,$sql);
    if($result)
    {
        echo "record deleted sucessfully";
        header('location:display.php');
    }
    else
    {
        echo "user could not found";
    }
    
}
?>