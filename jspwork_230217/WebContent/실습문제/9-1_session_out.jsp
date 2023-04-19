<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	session.invalidate(); //해당 세션을 없애고 세션에 속해있는 값들을 없앤다
	response.sendRedirect("9-1_session.jsp");
	 %>
</body>
</html>