<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Application</title>
</head>
<body>
    <form action="loginServlet" method="post">
        <fieldset style="width: 300px">
            <legend> Abhishek.com </legend>
            <table>
                <tr>
                    <td>UserName:</td>
                    <td><input type="text" name="username" required="required" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><input type="password" name="userpass" required="required" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login" /></td>
                    
                   
                </tr>
                
            </table>
        </fieldset>
    </form>
    <a href="View.html">View Details</a>
    <a href="insert.html">Insert User</a>
    <a href="Delete.html">Delete User</a>
</body>
</html>
