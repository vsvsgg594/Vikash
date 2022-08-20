<?php
// session_start();
// $_SESSION["username"] = "hello";

if ($_SERVER["REQUEST_METHOD"] == "POST") 
{
    $mobile = $_POST["mobile"];
    $passwd = $_POST["passwd"];
    $u_type = $_POST["u-type"];

    include "../partials/_dbconnect.php";
    $sql = "SELECT * FROM `user` WHERE `mobile`= '$mobile'";
    $result = mysqli_query($conn, $sql);

    if (mysqli_num_rows($result) <= 0) 
    {
        echo "user not found !";
    } 
    else 
    {
        $row = mysqli_fetch_assoc($result);

        if ($passwd == $row['password'] && $mobile == $row['mobile'] && $u_type == 'voter') 
        {
            // echo "everything is corect ";
            session_start();
            $_SESSION['username'] = $row['username'];
            $_SESSION['mobile'] = $row['mobile'];
            $_SESSION['address'] = $row['address'];
            $_SESSION['status'] = $row['status'];
            $_SESSION['image'] = $row['user_img'];

            header('Location: ../index.php');
        } 
        else 
        {
            echo "incorrect password ! || or user type";
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
    <title>Login | Digital Voting</title>

    <link rel="stylesheet" href="../css/login_style.css">
</head>

<body>
    <div class="container">
        <div class="login-header">
            <p>Online Voting System</p>
        </div>
        <div class="login-container">
            <div class="form-container">
                <div class="form-title">
                    <p>Login</p>
                </div>
                <form action="login.php" method="POST" class="form-box">
                    <div class="field">
                        <input type="tel" name="mobile" id="mobile" placeholder="Mobile no." maxlength="10" required>
                    </div>
                    <div class="field">
                        <input type="password" name="passwd" id="passwd" placeholder="Password" maxlength="30" required>
                    </div>
                    <div class="field">
                        <select name="u-type" id="u-type">
                            <option value="voter">Voter</option>
                            <option value="group">Group</option>
                        </select>
                    </div>
                    <div class="field">
                        <input type="submit" id="btn" value="Login">
                    </div>
                    <div class="field">
                        <p>New User?&nbsp;<a href="signup.php">Register here</a></p>
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>

</html>