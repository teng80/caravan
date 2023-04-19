<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Money" id="money"></jsp:useBean>
<jsp:setProperty property="num" name="money"/>

	<% 
 		out.print("입력된 금액이 "+money.getNum()+"는<br>"
 				+money.process(money.getNum()));
 	%>
 	
