<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="area.Season" id="season"></jsp:useBean>
<jsp:setProperty property="month" name="season"/>
	
	<h4>당신이 입력한 정보입니다.</h4>
	
	<%
		out.print("입력된 정수가  "+season.getMonth()  
				+ "은 계절이 "+season.process());
	%>
    