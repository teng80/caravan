<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Calendar calendar = Calendar.getInstance();
calendar.add(Calendar.YEAR, -1); // 1년 전
calendar.add(Calendar.MONTH, -2); // 2달 전
calendar.add(Calendar.DATE, -3); // 3일 전

SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
String dateString = dateFormat.format(calendar.getTime());
%>

오늘로부터 1년 2개월 3일 전 날짜는 <%= dateString %> 입니다.
</body>
</html>