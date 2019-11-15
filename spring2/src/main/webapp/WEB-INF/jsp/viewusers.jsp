<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

${obj }
<c:forEach items="${obj}" var="user">
<div>
	<b>User:<c:out value="${user.id}"/></b><br>
	<c:out value="${user.name}"/> <br>
	Username:<c:out value="${user.username}"/> <br>
	DOB:<c:out value="${user.dob}"/> <br>
	<c:out value="${user.contact}"/> <br>
	
</div>
</c:forEach>



</body>
</html>