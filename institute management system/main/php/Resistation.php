<?php
if($_SERVER["REQUEST_METHOD"]=="POST")
{
    $stname=$_POST['sname'];
    $ftname=$_POST['fname'];
    $mtname=$_POST['mname'];
    $mobile=$_POST['mobile'];
    $email=$_POST['ename'];
    $passwd=$_POST['passwd'];
    $address=$_POST['address'];
    $cpasswd=$_POST['cpassword'];
    $std=$_POST['std'];
    $fee=$_POST['fee'];

    if($passwd  !=$cpasswd )
    {
        echo"password could not match";
    }
    else
    {
        include "../connect/connection.php";
        $sql="INSERT INTO `student` ( `student_name`, `father_name`, `mother_name`, `mobile`, `password`, `email`, `address`, `std`, `fee`, `admmnission_date`) VALUES ( '$stname', '$ftname', '$mtname', ' $mobile', ' $email', '$passwd', ' $address', ' $std', ' $fee', current_timestamp());";
        $result=mysqli_query($conn,$sql);
        if($result)
        {
            echo "resistation sucessfull";
        
        }
    }

}
?>














<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>institute management system</title>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
    <div class="container">
        <header>
            <nav class="navbar">
                <h3>Instituete management system</h3>
            </nav>
           
        </header>
       
        <div class="sub-conatiner">
            <h4>Resistation form</h4>
            <div class="child-class">
                <form action="#" method="POST">
                    <div class="field">
                        <input type="text" placeholder="enter student name" name="sname" required>
                    </div>
                    <div class="field">
                        <input type="text" placeholder="fatrher's name" name="fname" required>
                    </div>
                    <div class="field">
                    <input type="text" placeholder="mother's name" name="mname" required>
                    </div>
                    <div class="field">
                        <input type="tel" placeholder="mobile" name="mobile" maxlength="10" minlength="10" required>
                    </div>
                    <div class="field">
                        <input type="text" placeholder="email" name="ename" required>
                    </div>
                    <div class="field">
                        <input type="text" placeholder="address" name="address" required>
                    </div>
                    <div class="field">
                        <input type="password" placeholder="password" name="passwd" required>
                    </div>
                    <div class="field">
                    <input type="password" placeholder="cormfirm password" name="cpassword" required>
                    </div>
                    <div class="field">
                        <input type="text" placeholder="standard" name="std" required>

                    </div>
                    <div class="field">
                        <input type="text" placeholder="fee" name="fee" required>

                    </div>
                   
                    <div class="field">
                        <button type="submit" value="resistation" name="btn" class="btn">resistation</button>

                    </div>






                </form>
            </div>
        </div>
    </div>
    
</body>
</html>