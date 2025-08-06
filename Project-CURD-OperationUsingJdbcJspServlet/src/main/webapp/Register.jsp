<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <h2>Employee Registration</h2>
    <form action="./registerData" method="post" novalidate="novalidate">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="joiningDate">Joining Date:</label>
        <input type="date" id="joiningDate" name="joiningDate" required><br><br>

        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" step="0.01" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="phoneNumber">Phone Number:</label>
        <input type="text" id="phoneNumber" name="phoneNumber" required><br><br>

        <label for="role">Role:</label>
        <input type="text" id="role" name="role" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>

