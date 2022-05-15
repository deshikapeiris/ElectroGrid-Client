<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ElectroGrid</title>
<link rel="stylesheet" href="Views/bootstrap.min.css">
<script src="Components/jquery-3.5.0.min.js"></script>
<script src="Components/login.js"></script>

</head>
<body style="background-image: url('Images/bg.jpg');">

<!-- header  -->
			    <nav class=" navbar navbar-expand-lg navbar-dark " style="background-color: #000099;">
			        <a class="navbar-brand" href="Home.jsp">ElectroGrid</a>
			          <ul class="navbar-nav mr-auto">
			        </ul>
			          
			    </nav>



<br><br><br><br>
<br><div class="container">
<center>
	<div class="frame"><div class="col-sm-7" > 
		<div class="container">
		<div class="card"><div class="card-body" >
		
		<title>Login</title>
		
		<div class="wrap">
		<form class="form" name="formlogin"><h1 style = "text-align:center"> LOGIN</h1>
		
		 <br>
		 <h6>Username:</h6>
		 <input id="userName" name="userName" type="text" class="form-control form-control-sm"><br>
		 
		 <br>
		<h6> Password:</h6>
		 <input id="password" name="password" type="password" class="form-control form-control-sm">
 		 <br>
 		 
		<a href="users.jsp" type="button" class="btn btn-primary">Log in</button></a>	  				
		 </form></center></div></div>
		</div>
	  </div>
	 </div>
	 </div></div>
  
  
</body>
<br><br><br><br>

<footer class="bg-dark text-center text-white">

  <!-- Copyright -->
  <div class="text-left p-4" style="background-color: #737373;">
   Copyright 2022 © ELECTROGRID. All Rights Reserved ..
   </div>
</footer>

</html>