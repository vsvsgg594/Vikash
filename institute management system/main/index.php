<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>institute management system</title>
    <link rel="stylesheet" href="./css/display.css">
</head>
<body>
    <div class="contnaier">
        <header>
            <nav>
                <button type="submit" value="resistation" name="btn" class="btn"><a href="./php/Resistation.php">Resistation</a></button>
            </nav>
        </header>
        <div class="sub-container">
            <table class="table">
                <tr>
                    <th>s_no</th>
                    <th>student_name</th>
                    <th>father_name</th>
                    <th>mother_name</th>
                    <th>mobile</th>
                    <th>email</th>
                    <th>password</th>
                    <th>address</th>
                    <th>std</th>
                    <th>fee</th>
                    <th>admmnission_date</th>
                    <th>operation</th>
                    </tr>
                    <?php 
                    include "./connect/connection.php";
                    $sql="SELECT * FROM `student`";
                    $result=mysqli_query($conn,$sql);
                    if($result)
                    {
                        while($row=mysqli_fetch_assoc($result))
                        {
                            $id=$row['s_no'];
                            $student=$row['student_name'];
                            $fname=$row['father_name'];
                            $mname=$row['mother_name'];
                            $mobile=$row['mobile'];
                            $passwd=$row['password'];
                            $email=$row['email'];
                            $address=$row['address'];
                            $fee=$row['fee'];
                            $std=$row['std'];
                            $time=$row['admmnission_date'];
                            echo'<tr>
                            <th>'.$id.'</th>
                            <td>'.$student.'</td>
                            <td>'.$fname.'</td>
                            <td>'. $mname.'</td>
                            <td>'.$mobile.'</td>
                            <td>'. $passwd.'</td>
                            <td>'.$email.'</td>
                            <td>'.$address.'</td>
                            <td>'. $std.'</td>
                            <td>'. $fee.'</td>
                            <td>'.$time.'</td>
                            <td>
                            <button><a href="update.php? updateid='.$id.'">update</a></button>
                            <button><a href="delete.php? deleteid='.$id.'">delete</a></button>
                            </td>
                            </tr>>';


                        }
                    }


                    ?>
                   <!-- <td>
                        <button><a href="#">update</a></button>
                        <button><a href="#">delete</a></button>
                    </td>
                -->
               
                
                


            </table>
        </div>
    </div>
    
</body>
</html>