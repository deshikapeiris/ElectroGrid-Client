package com;
import java.sql.*;



public class User {



public Connection connect()
{
Connection con = null;

try
{
Class.forName("com.mysql.jdbc.Driver");
con= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/electogrid", "root", "deshika");

//For testing
System.out.print("Successfully connected");
}
catch(Exception e)
{
e.printStackTrace();
}

return con;
}



//INSERT
public String insertUser(String regNo, String name, String address,String email, String phone, String userName, String password)
{
String output = "";
try
{
Connection con = connect();
if (con == null)
{
return "Error while connecting to the database for inserting.";
}
// create a prepared statement
String query = " insert into user (`userID`,`regNo`,`name`,`address`,`email`,`phone`,`userName`,`password`)"
	       + " values (?, ?, ?, ?, ?, ?, ?, ?)";

PreparedStatement preparedStmt = con.prepareStatement(query);

// binding values
preparedStmt.setInt(1, 0);
preparedStmt.setString(2, regNo);
preparedStmt.setString(3, name);
preparedStmt.setString(4, address);
preparedStmt.setString(5, email);
preparedStmt.setString(6, phone);
preparedStmt.setString(7, userName);
preparedStmt.setString(8, password);


// execute the statement
preparedStmt.execute();
con.close();
String newUsers = readUsers();
output = "{\"status\":\"success\", \"data\": \"" +newUsers + "\"}";
}
catch (Exception e)
{
output = "{\"status\":\"error\", \"data\":\"Error while inserting the user.\"}";
System.err.println(e.getMessage());
}
return output;
}



//READ
public String readUsers()
{
String output = "";
try
{
Connection con = connect();
if (con == null)
{
return "Error while connecting to the database for reading.";
}

// Prepare the html table to be displayed
output = "<table border='1'><tr><th>Reg No</th>"
		+ "<th>Name</th><th>Address</th>" 
		+ "<th>Email</th><th>Phone</th>" 
		+ "<th>User Name</th><th>Password</th>" 
		+ "<th>Update</th><th>Remove</th></tr>"; 

String query = "select * from user";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(query);

// iterate through the rows in the result set
while (rs.next())
{
	String userID = Integer.toString(rs.getInt("userID")); 
	 String regNo = rs.getString("regNo"); 
	 String name = rs.getString("name"); 
	 String address = rs.getString("address"); 
	 String email = rs.getString("email"); 
	 String phone = rs.getString("phone"); 
	 String userName = rs.getString("userName"); 
	 String password = rs.getString("password"); 

// Add a row into the html table
	 output += "<tr><td><input id='hidUserIDUpdate' name='hidUserIDUpdate' type='hidden' value='" + userID + "'>"+regNo + "</td>";
	 output += "<td>" + name + "</td>"; 
	 output += "<td>" + address + "</td>"; 
	 output += "<td>" +email + "</td>"; 
	 output += "<td>" +phone + "</td>"; 
	 output += "<td>" +userName + "</td>"; 
	 output += "<td>" +password + "</td>"; 

// buttons
	 output += "<td><input name='btnUpdate' type='button' value='Update'  "
	 		+ "class='btnUpdate btn btn-success' data-userid='" + userID + "'></td>" 
	 		+ "<td><input name='btnRemove' type='submit' value='Remove' class='btnRemove btn btn-danger' data-userid='" + userID + "'></td></tr>";
			 } 
con.close();
// Complete the html table
output += "</table>";
}
catch (Exception e)
{
output = "Error while reading the users.";
System.err.println(e.getMessage());
}
return output;
}






//DELETE
public String deleteUser(String userID)
{
String output = "";
try
{
Connection con = connect();
if (con == null)
{
return "Error while connecting to the database for deleting.";
}

// create a prepared statement
String query = "delete from user where userID=?";
PreparedStatement preparedStmt = con.prepareStatement(query);

// binding values
preparedStmt.setInt(1, Integer.parseInt(userID));

// execute the statement
preparedStmt.execute();
con.close();

//output = "Deleted successfully";
String newUsers = readUsers();
output = "{\"status\":\"success\", \"data\": \"" +newUsers + "\"}";

}
catch (Exception e)
{
//output = "Error while deleting the user.";
output = "{\"status\":\"error\", \"data\":\"Error while deleting the user.\"}";
System.err.println(e.getMessage());
}
return output;
}





//UPDATE
public String updateUser(String userID, String regNo, String name, String address,String email, String phone, String userName, String password)
{
String output = "";
try
{
Connection con = connect();
if (con == null)
{
return "Error while connecting to the database for updating.";
}

// create a prepared statement
String query = "UPDATE user SET regNo=?,name=?,address=?,email=?,phone=?,userName=?,password=? WHERE userID=?"; 
PreparedStatement preparedStmt = con.prepareStatement(query);

// binding values
preparedStmt.setString(1, regNo); 
preparedStmt.setString(2, name); 
preparedStmt.setString(3, address); 
preparedStmt.setString(4, email); 
preparedStmt.setString(5, phone); 
preparedStmt.setString(6, userName); 
preparedStmt.setString(7, password); 
preparedStmt.setInt(8, Integer.parseInt(userID)); 

// execute the statement
preparedStmt.execute();
con.close();
//output = "Updated user details successfully";
String newUsers = readUsers();
output = "{\"status\":\"success\", \"data\": \"" +newUsers + "\"}";



}
catch (Exception e)
{
//output = "Error while updating the user Details.";
output = "{\"status\":\"error\", \"data\":\"Error while updating the user.\"}";
System.err.println(e.getMessage());
}
return output;
}



public String login(String parameter, String parameter2) {
	
	return null;
}



}