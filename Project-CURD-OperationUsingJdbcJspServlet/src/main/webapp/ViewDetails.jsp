<%@ page import="java.util.List, com.nt.dto.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee List</title>
    <style>
        table { width: 80%; margin: auto; border-collapse: collapse; }
        th, td { border: 1px solid black; padding: 8px; text-align: left; }
        th { background-color: #f2f2f2; }
    </style>
</head>
<body>
    <h2 style="text-align: center;">Employee List</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Joining Date</th>
            <th>Salary</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Role</th>
        </tr>
        <%
            List<Employee> employees = (List<Employee>) request.getAttribute("employees");
            if (employees != null) {
                for (Employee emp : employees) {
        %>
        <tr>
            <td><%= emp.getId() %></td>
            <td><%= emp.getName() %></td>
            <td><%= emp.getJoiningDate() %></td>
            <td><%= emp.getSalary() %></td>
            <td><%= emp.getEmail() %></td>
            <td><%= emp.getPhoneNumber() %></td>
            <td><%= emp.getRole() %></td>
        </tr>
        <%
                }
            } else {
        %>
        <tr>
            <td colspan="7" style="text-align: center;">No employees found</td>
        </tr>
        <% } %>
    </table>
</body>
</html>
