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
		// 세션명 userID 정보를 갖고와야함. 왜냐? 그 값이 null인지 확인해야하니까
		// null이 맞는가? 그렇다면 sendredirect, 아니라면 페이지 표시 (else)	
		if(session.getAttribute("userID") == null) {
			response.sendRedirect("9-1_session.jsp");			
		}
	%>

	<h4><% session.getAttribute("userID"); %>님 반갑습니다.</h4>
	<a href="9-1_session_out.jsp">로그아웃</a>
</body>
</html>