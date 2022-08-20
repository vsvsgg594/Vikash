<?php

session_start();

if(!isset($_SESSION['username']))
{
header('Location: php/login.php');
exit;
}


if($_SERVER['REQUEST_METHOD'] == 'POST')
{
    if(isset($_POST['logout']))
    {
        session_unset();
        session_destroy();
        header('Location: php/login.php');
    }

    include "partials/_dbconnect.php";

    if(isset($_POST['kamal']))
    {
        $sql="UPDATE `party` SET `vote_count` = vote_count+1 WHERE `party`.`s_no` = 1;";
        $result=mysqli_query($conn, $sql);
        if($result)
        {
            $mob=$_SESSION['mobile'];
            $sql="UPDATE `user` SET `status` = 'Voted' WHERE `user`.`mobile` = '$mob';";
            $result=mysqli_query($conn, $sql);
            if($result)
            {
                echo"voted successfully";
                $_SESSION['status']='Voted';
            }
        }
    }

    else if(isset($_POST['panja']))
    {
        $sql="UPDATE `party` SET `vote_count` = vote_count+1 WHERE `party`.`s_no` = 2;";
        $result=mysqli_query($conn, $sql);
        if($result)
        {
            $mob=$_SESSION['mobile'];
            $sql="UPDATE `user` SET `status` = 'Voted' WHERE `user`.`mobile` = '$mob';";
            $result=mysqli_query($conn, $sql);
            if($result)
            {
                echo"voted successfully";
                $_SESSION['status']='Voted';
            }
        }
    }

    else if(isset($_POST['jharu']))
    {
        $sql="UPDATE `party` SET `vote_count` = vote_count+1 WHERE `party`.`s_no` = 3;";
        $result=mysqli_query($conn, $sql);
        if($result)
        {
            $mob=$_SESSION['mobile'];
            $sql="UPDATE `user` SET `status` = 'Voted' WHERE `user`.`mobile` = '$mob';";
            $result=mysqli_query($conn, $sql);
            if($result)
            {
                echo"voted successfully";
                $_SESSION['status']='Voted';
            }
        }
    }

    else if(isset($_POST['lalten']))
    {
        $sql="UPDATE `party` SET `vote_count` = vote_count+1 WHERE `party`.`s_no` = 4;";
        $result=mysqli_query($conn, $sql);
        if($result)
        {
            $mob=$_SESSION['mobile'];
            $sql="UPDATE `user` SET `status` = 'Voted' WHERE `user`.`mobile` = '$mob';";
            $result=mysqli_query($conn, $sql);
            if($result)
            {
                echo"voted successfully";
                $_SESSION['status']='Voted';
            }
        }
    }

}

// echo "login successfuly with user ".$_SESSION['username'];
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HOME | Digital Voting</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <div class="container">
        <div class="navbar">
            <h2>Welcome<?php echo " ".$_SESSION['username'] ?> to Digital Voting  Platform</h2>
            <div class="logout-btn">
                <form action="index.php" method="POST">
                    <input type="submit" value="Log out" name="logout">
                </form>
            </div>
        </div>
        <div class="detail-container">
            <div class="user-info">
                <div class="user-icon">
                    <div class="user">
                        <?php echo"<img src=\"".$_SESSION['image']."\">"?>
                    </div>
                </div>
                <div class="total-info">
                    <div class="user-name">
                        <p>Name : <span><?php echo "".$_SESSION['username']; ?></span></p>
                    </div>

                    <div class="user-mobile">
                        <p>Mobile : <span><?php echo "".$_SESSION['mobile']; ?></span></p>
                    </div>

                    <div class="user-address">
                        <p>Address : <span><?php echo "".$_SESSION['address']; ?></span></p>
                    </div>

                    <div class="user-vote-status">
                        <p>Status : <span><?php echo "".$_SESSION['status']; ?></span></p>
                    </div>
                </div>
            </div>
            <div class="party-info">
                <!-- party info container -->
                <?php
                    include "partials/_dbconnect.php";
                    $sql="select * from party";
                    $result=mysqli_query($conn, $sql);
                    
                    while($row=mysqli_fetch_assoc($result))
                    {
                        echo "<form action=\"index.php\" method=\"POST\" class=\"party-info-container\">
                        <div class=\"party-text-container\">
                            <div class=\"party-name\">
                                <p>Party name : <span>".$row['party_name']."</span> </p>
                            </div>
                            <div class=\"party-symbol-name\">
                                <p>Party symbol : <span>".$row['symbol_name']."</span> </p>
                            </div>
                            <div class=\"party-vote-btn\">";
                            
                            if($_SESSION['status'] == "Voted")
                            {
                                echo "<button type=\"submit\" name=".$row['symbol_name']." disabled>Voted</button>";
                            }
                            else
                            {
                                echo "<button type=\"submit\" name=".$row['symbol_name'].">Vote</button>";
                            }

                            echo "</div>
                        </div>
                        <div class=\"party-logo-container\">
                            <img src=".$row['symbol_img'].">
                        </div>
                    </form>";
                    }
                    
                ?>

                <!-- <div class="party-info-container">
                    <div class="party-text-container">
                        <div class="party-name">
                            <p>Party name : </p>
                        </div>
                        <div class="party-symbol-name">
                            <p>Party symbol : </p>
                        </div>
                        <div class="party-vote-btn">
                            <p>vote</p>
                         </div>
                    </div>
                    <div class="party-logo-container">
                        logo
                    </div>
                </div> -->

            </div>
        </div>
    </div>
</body>
</html>