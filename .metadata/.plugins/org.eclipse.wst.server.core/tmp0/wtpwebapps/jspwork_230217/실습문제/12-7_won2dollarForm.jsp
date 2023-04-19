<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Won2dollar" id="won2dollar"></jsp:useBean>
<jsp:setProperty property="*" name="won2dollar"/>
	
	<h4>당신이 입력한 정보입니다.</h4>
	
	<%
		out.print("입력된 원화가  "+won2dollar.getWon() 
				+ "원은 $"+won2dollar.process());
	%>
    