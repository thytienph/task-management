<%-- 
    Document   : user-register
    Created on : Apr 18, 2022, 1:36:51 PM
    Author     : ZenBook
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h2>Register Forms</h2>

        <form action="/action_page.php">
            <label for="name">Full name:</label><br>
            <input type="text" id="name" name="name" value="John"><br>
            <label for="email">Email: </label><br>
            <input type="text" id="email" name="email" value="John@gmail.com"><br>
            <label for="mobile">Mobile:</label><br>
            <input type="number" id="mobile" name="mobile" value="0985137131"><br>
            <label for="gender">Gender:</label><br>
            <select id="gender">
                <option value="Male">Male</option>
                <option value="Female">Female</option>
                <option value="Other">Other</option>
            </select><br>
            <label for="password">Password:</label><br>
            <input type="password" id="password" name="password" value="12345678"><br>
            <label for="cfpassword">Confirm Password:</label><br>
            <input type="password" id="cfpassword" name="cfpassword" value="12345678"><br>
            <br>
            <input type="submit" value="Submit">
        </form> 
    </body>
</html>
