<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.GuGuDan" id="guGuDan"></jsp:useBean>
<h4>구구단 출력하기</h4>
<%
	int num=5;
	for (int i=1; i<=9; i++) {
		out.print(num + " * " + i + " = " + guGuDan.prosess(num, i) + "<br>");
	}
%>
