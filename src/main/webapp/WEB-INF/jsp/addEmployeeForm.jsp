<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Employee</h1>
<form:form action="addEmployee" method="post" modelAttribute="employee">
<form:label path="employeeId">Employee Id:</form:label>form:label>
<form:input path="employeeId"/><br>

<form:label path="employeeName">Employee Id:</form:label>form:label>
<form:input path="employeeName"/><br>

<form:label path="employeeDepartment">Employee Id:</form:label>form:label>
<form:input path="employeDepartment"/><br>

<form:label path="employeeSalary">Employee Id:</form:label>form:label>
<form:input path="employeeSalary"/><br>



</form:form>
</body>
</html>