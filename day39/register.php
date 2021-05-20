
<!DOCTYPE html>
<html>
<head>
<title>Creative Colorlib SignUp Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script> -->
<!-- Custom Theme files -->
<link href="signup.css" rel="stylesheet" type="text/css" media="all" />
<!-- //Custom Theme files -->
<!-- web font -->
<link href="//fonts.googleapis.com/css?family=Roboto:300,300i,400,400i,700,700i" rel="stylesheet">
<!-- //web font -->

</head>
<body>
<?php
if(isset($_POST['submit'])){
    $hostname="localhost";
    $username="root";
    $password="";
    $databasename="signup";
$uname=$_POST['Username'];
$email=$_POST['email'];
$number=$_POST['Number'];
$password=$_POST['password'];
$cpassword=$_POST['password'];

$connect=mysqli($hostname,$username, $password,$databasename);
$query="INSERT INTO `registration`( `username`, `email`, `number`, `password`, `cpassword`) VALUES ('$uname','$email','$number','$password','$cpassword')";

$result=mysqli_query($connect,$query);

        if($result){
            echo "data inserted";
        }else{
            echo "data not inserted";
        }
    mysqli_free_result($result);
    mysqli_close($connect);

}
?> 
	<!-- main -->
	<div class="main-w3layouts wrapper">
		
		<div class="main-agileinfo">
			<div class="agileits-top">
				<form action="links.php" method="POST">
					<input class="text" type="text" name="Username" placeholder="Username" required="">
					<input class="text email" type="email" name="email" placeholder="Email" required="">
					<input class="text" type="Number" name="Number" placeholder="ContactNo" required="">
					<input class="text" type="password" name="password" placeholder="Password" required="">
					<input class="text w3lpass" type="password" name="password" placeholder="Confirm Password" required="">
					<div class="wthree-text">
						<label class="anim">
							<input type="checkbox" class="checkbox" required="">
							<span>I Agree To The Terms & Conditions</span>
						</label>
						<div class="clear"> </div>
					</div>
					<input type="submit" name="submit" value="SIGNUP">
				</form>
				<p>Don't have an Account? <a href="#"> Login Now!</a></p>
			</div>
		</div>
		
	</div>
	<!-- //main -->
</body>
</html>
