<?php
$error;
if($_SERVER["REQUEST_METHOD"] == "POST")
{ 
    $username=$_POST["uname"];
    $mobile=$_POST["mobile"];
    $passwd=$_POST["passwd"];
    $cpasswd=$_POST["cpasswd"];
    $address=$_POST["address"];
    
    // code for file handling
    $file_name=$_FILES['u_image']['name'];
    $file_size=$_FILES['u_image']['size'];
    $file_tmp_name=$_FILES['u_image']['tmp_name'];
    $file_type=$_FILES['u_image']['type'];


    if($passwd != $cpasswd)
    {
        echo"Pasword not matched";
    }
    else
    {
        move_uploaded_file($file_tmp_name, "../img/user_img/".$file_name);
        $img_path="img/user_img/".$file_name;

        include "../partials/_dbconnect.php";
        $sql="INSERT INTO `user` (`username`, `mobile`, `password`,`user_img`, `address`, `date_time`) VALUES ('$username', '$mobile', '$passwd', '$img_path', '$address', current_timestamp());";
        $result=mysqli_query($conn, $sql);
        if($result)
        {
            echo"registered sucessfully";
            header('Location: login.php');
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
    <title>Sign Up | Digital Voting</title>

    <link rel="stylesheet" href="../css/signup_style.css">
</head>

<body>
    <div class="container">
        <div class="login-header">
            <p>Online Voting System</p>
        </div>
        <div class="login-container">
            <div class="form-container">
                <div class="form-title">
                    <p>Register</p>
                </div>
                <form action="signup.php" method="POST" class="form-box" enctype="multipart/form-data">
                    <div class="field">
                        <input type="text" name="uname" id="uname" placeholder="Username" maxlength="50" required>
                        <input type="tel" name="mobile" id="mobile" placeholder="Mobile" maxlength="10" required>
                    </div>
                    <div class="field">
                        <input type="password" name="passwd" id="passwd" placeholder="Password" maxlength="30" required>
                        <input type="password" name="cpasswd" id="cpasswd" placeholder="Confirm Password" maxlength="30" required>
                    </div>
                    <div class="field t-field">
                        <textarea name="address" id="address" placeholder="Enter your address" required></textarea>
                    </div>
                    <div class="field choose-field">
                        <input type="file" name="u_image">
                    </div>
                    <div class="field">
                        <input type="submit" id="btn" value="Register">
                    </div>
                    <div class="field">
                        <p>Already User?&nbsp;<a href="login.php">Login here</a></p>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>

</html>