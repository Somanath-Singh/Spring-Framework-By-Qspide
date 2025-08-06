<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<head>
    <title>User Registration Form</title>
</head>
<body>

<h2 style="color:blue">User Registration</h2>

<form:form modelAttribute="user" action="register" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><form:textarea path="address" /></td>
        </tr>
        <tr>
            <td>Date of Birth:</td>
            <td><form:input path="dob" type="date" /></td>
        </tr>
        <tr>
            <td>Preferred Language:</td>
            <td>
                <form:select path="language">
                    <form:option value="Java">Java</form:option>
                    <form:option value="Python">Python</form:option>
                    <form:option value="JavaScript">JavaScript</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit" />
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
