<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Three" id="three"></jsp:useBean>
<jsp:setProperty property="num" name="three"/>
	
	<h4>당신이 입력한 정보입니다.</h4>
	
	<%
		out.print("입력된 수가 "+three.getNum()+"은 "+three.process());
	%>
    