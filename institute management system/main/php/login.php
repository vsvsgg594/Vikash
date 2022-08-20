<?php
if($_SERVER["REQUEST_METHOD"]=="POST")
{
$mobile=$_POST['mobile'] ;
$passwd=$_POST['passwd'];
include "../connect/connection.php";
$sql="SELECT * FROM admin";
$result=mysqli_query($conn,$sql);

while($row = mysqli_fetch_assoc($result))
{
    if($mobile==$row['mobile'] && $passwd==$row['password'])
    {
        header('location:display.php');
    }
    else
    {
        echo"user cnanot found";
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
    <link rel="stylesheet" href="../css/styles.css">
</head>
<body>
    <div class="conatiner">
        <header>
            <nav>
            <h2> institute management system</h2>
            </nav>
        </header>
        <div class="sub-conatiner">
            <h3>login form</h3>
            <div class="child">
                <form action="#" method="POST">
                    <div class="field">
                        <input type="text" placeholder="mobile no" name="mobile">
                    </div>
                    <div class="field">
                        <input type="password" placeholder="password" name="passwd">
                    </div>
                    <div class="field">
                        <button type="submit" value="submit" name="btn" class="btn">login</button>
                    </div>
                    <P>new student ?<a href="Resistation.php">resister here</a></P>
                </form>

            </div>
        </div>
    </div>
</body>
</html>