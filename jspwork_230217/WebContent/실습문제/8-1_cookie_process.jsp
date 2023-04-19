<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String userid = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	if(userid.equals("admin") && passwd.equals("admin1234")){
		Cookie info = new Cookie("userID", userid);
		info.setMaxAge(365*24*60*60);
		info.setPath("/");
		response.addCookie(info);
		response.sendRedirect("8-1_welcome.jsp");
		
	}else{
		out.print("아이디와 비밀번호를 확인해 주세요.");
	}
%>
