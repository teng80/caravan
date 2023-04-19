<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="area.Rectangle" id="rectangle"></jsp:useBean>
<h4>사각형의 면적 출력하기</h4>

<%
	int i=20;
	int j=30;

	out.print("가로"+i+", 세로 "+j+"인 사각형의 면적은 "+rectangle.process(20, 30));
%>
