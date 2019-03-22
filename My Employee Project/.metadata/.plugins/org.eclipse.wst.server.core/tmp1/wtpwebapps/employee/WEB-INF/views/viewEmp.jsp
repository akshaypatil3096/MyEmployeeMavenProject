<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello, ${sessionScope.uname}</h2>
	<h3 align="center">Employee List</h3>
	<table style="background-color: cyan; margin: auto;" border="1">
		<c:forEach var="e" items="${requestScope.emp_list}">

			<tr>
				<td>${e.id}</td>
				<td>${e.name}</td>

				<td>${e.desig}</td>

				<td>${e.sal}</td>
				<td><a href="<spring:url value='/update?id=${e.id}'/>">Update</a></td>
				<td><a href="<spring:url value='/delete?id=${e.id}'/>">Delete</a></td>
			</tr>

		</c:forEach>
		<tr>
			<td colspan="2"><a href="<spring:url value='/add'/>">Add New
					Employee</a></td>
		</tr>
		<tr>
			<td colspan="2"><h2>
					<a href="<spring:url value='/logout'/>">Log Out</a>
				</h2></td>
		</tr>
	</table>



</body>
</html>