<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<table style="background-color: lime; margin: auto;">
<!-- 		<tr> -->
<!-- 			<td>ID</td><td>Name</td><td>Designation</td><td>Salary</td> -->
<!-- 		</tr> -->
		<tr>
			<td>${requestScope.empdetails.id}</td><td>${requestScope.empdetails.name}</td><td>${requestScope.empdetails.desig}</td><td>${requestScope.empdetails.sal}</td><td><a href="/employee/update?id=${requestScope.empdetails.id}">Update</a></td>	<td><a href="/employee/delete?id=${requestScope.empdetails.id}">Delete</a></td>
		</tr>
	
	</table>


</body>
</html>