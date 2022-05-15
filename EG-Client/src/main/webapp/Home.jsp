<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Electro-Grid</title>
<link rel="stylesheet" href="Views/bootstrap.min.css">
<script src="Components/jquery-3.5.0.min.js"></script>
<script src="Components/user.js"></script>
</head>
<body> 




		<!-- header  -->
			    <nav class=" navbar navbar-expand-lg navbar-dark " style="background-color: #000099;">
			        <a class="navbar-brand" href="Home.jsp">ElectroGrid</a>
			          <ul class="navbar-nav mr-auto">
			        </ul>
			          <form class="form-inline my-2 my-lg-0">
			             <a href ="Login.jsp" button class="btn btn-outline-success my-2 my-sm-0" type="submit">Logout</a>
			          </form>
			    </nav>


<br>
<div class="container">
                  

<div class="row">
<div class="col-sm-4"> 
   <a href="users.jsp"><img src="Images/user.png" alt="Nature"style="width:75%; height:75%;"></a>
    <h4>User Management</h4>
    <br>
  </div>
  <div class="col-sm-4"> 
   <a href="users.jsp"><img src="Images/bill.jpg" alt="Nature" style="width:75%; height:75%;"></a>
    <h4>Bill Management</h4>
   
  </div>




<div class="col-sm-4"> 
   <a href="users.jsp"><img src="Images/payment.jpg" alt="Nature" style="width:75%; height:75%;"></a>
    <h4>Payment Management</h4>
 

  </div>
  
  
  <div class="col-sm-4"> 
   <a href="users.jsp"><img src="Images/unit.jpg" alt="Nature" style="width:75%; height:75%;"></a>
    <h4>Unit Management</h4>
 

  </div>
  
  
  <div class="col-sm-4"> 
   <a href="users.jsp"><img src="Images/employee.jpg" alt="Nature" style="width:75%; height:75%;"></a>
    <h4>Employee Management</h4>
 

  </div>
  

  
  <div class="col-sm-4"> 
   <a href="users.jsp"><img src="Images/feedback.jpg" alt="Nature" style="width:75%; height:75%;"></a>
    <h4>Feedback Management</h4>
   
  </div>
</div></div>


</body>



<footer class="bg-dark text-center text-white">

  <!-- Copyright -->
  <div class="text-left p-4" style="background-color: #737373;">
   Copyright 2022 © ELECTROGRID. All Rights Reserved ..
   </div>
  <!-- Copyright -->
</footer>

</html>