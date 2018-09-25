<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All EmployeeDetails</title>
</head>
<body bgcolor="cyan">
<h1>All EmployeeDetails</h1><hr>
<h3>
<table border="1" cellspacing="5" cellpadding="5">
<thead>
<tr>
<th>Employee ID</th>
<th>Employee Name</th>
<th>Employee Department</th>
<th>Employee Salary</th>
<th>Edit</th>
<th>Delete</th>
</tr>
</thead>
<tbody>
<c:forEach var="employee" items="${allEmployees}">
<td>${employee.employeeId}</td>
<td>${employee.employeeName}</td>
<td>${employee.employeeDepartment}</td>
<td>${employee.employeeSalary}</td>
<td><a href="/editEmployeePage/${employee.employeeId}">Edit</a></td>
<td><a href="/deleteEmployee/${employee.employeeId}">Edit</a></td>

</c:forEach>
</tbody>



</table>




</h3>

</body>
</html>