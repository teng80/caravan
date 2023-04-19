<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.DivAndRemains" id="divAndRemains"></jsp:useBean>
<jsp:setProperty property="num" name="divAndRemains"/>

<h4>당신이 입력한 정보입니다.</h4>
	
	<%
		out.print("입력된 정수가 "+divAndRemains.getNum()
			+"은 "+divAndRemains.process(divAndRemains.getNum()));
	%>
	
	
	
	
	
	
	
	
	
	
