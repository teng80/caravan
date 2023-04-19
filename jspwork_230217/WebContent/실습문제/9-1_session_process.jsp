<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	if(userid.equals("admin") && passwd.equals("admin1234")){
		session.setAttribute("userID", userid);
		response.sendRedirect("9-1_welcome.jsp");
		
	}else{
		out.print("아이디와 비밀번호를 확인해 주세요.");
	}
%>
