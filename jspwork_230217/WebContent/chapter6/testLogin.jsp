<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String s_id="hong";
	String s_pw="1234";
	String s_name="홍길동";
// 	한글처리 인코딩 방식 utf-8
// 	s_name = URLEncoder.encode(s_name, "utf-8");
// 	String s_name="gildong";
	
// 	아이디, 비밀번호가 일치하면 main.jsp로 자동이동
	if(s_id.equals(request.getParameter("id")) &&
		s_pw.equals(request.getParameter("pw"))){
// 		main.jsp?name : main.jsp로 name 값을 넘김
// 	한글처리 인코딩 방식 utf-8
		response.sendRedirect("main.jsp?name="+URLEncoder.encode(s_name, "utf-8"));
	} else {
//	 	아이디, 비밀번호가 일치하지 않으면 login.html로 자동이동
		response.sendRedirect("login.html");
	}
%>