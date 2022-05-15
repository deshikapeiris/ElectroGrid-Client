<%@page import="com.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management</title>
<link rel="stylesheet" href="Views/bootstrap.min.css">
<script src="Components/jquery-3.5.0.min.js"></script>
<script src="Components/user.js"></script>
</head>
<body> 

<div >
		<!-- header  -->
			    <nav class=" navbar navbar-expand-lg navbar-dark " style="background-color: #000099;">
			        <a class="navbar-brand" href="Home.jsp">ElectroGrid</a>
			          <ul class="navbar-nav mr-auto">
			        </ul>
			          <form class="form-inline my-2 my-lg-0">
			             <a href ="Login.jsp" button class="btn btn-outline-success my-2 my-sm-0" type="submit">Logout</a>
			          </form>
			    </nav>



<div class="container"><div class="row"> <div class="col-sm-5"> 
<br><br>
<div class="card"> <div class="card-body" border="thick solid blue">


<h1>User Management</h1>
<form id="formUser" name="formUser" method="post" action="users.jsp">

 <br>Reg No: 
 <input id="regNo" name="regNo" type="text" 
 class="form-control form-control-sm">
 
 <br> Name: 
 <input id="name" name="name" type="text" 
 class="form-control form-control-sm">
 
 <br> Address: 
 <input id="address" name="address" type="text" 
 class="form-control form-control-sm">
 
 <br> Email: 
 <input id="email" name="email" type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"
 class="form-control form-control-sm">
 
 
  <br> Phone: 
 <input id="phone" name="phone" type="text"  maxLength={10}
 class="form-control form-control-sm">
 
 <br> User Name: 
 <input id="userName" name="userName" type="text" 
 class="form-control form-control-sm">
 
 <br> Password: 
 <input id="password" name="password" type="text" 
 class="form-control form-control-sm">
 
 
 <br>
 <input id="btnSave" name="btnSave" type="button" value="Save" 
 class="btn btn-primary">
 <input type="hidden" id="hidUserIDSave" 
 name="hidUserIDSave" value="">
</form></div></div>


<div id="alertSuccess" class="alert alert-success"></div>
<div id="alertError" class="alert alert-danger"></div></div>
<br>

<div class="col-sm-7">
<br><br>
<h3 class="text-center">User Details</h3>
<hr width="80%">
<br>

<div id="divUsersGrid">
 <%
 User userObj = new User(); 
 out.print(userObj.readUsers());
 %>
 
</div>
</div> </div> </div> </div>
</body>

<br>



<footer class="bg-dark text-center text-white">

  <!-- Copyright -->
  <div class="text-left p-4" style="background-color: #737373;">
   Copyright 2022 © ELECTROGRID. All Rights Reserved ..
   </div>
  <!-- Copyright -->
</footer>

</html>
