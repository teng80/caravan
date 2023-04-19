
<%@page import="java.util.Scanner"%>
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
		response.setIntHeader("refresh", 5);
		Calendar cal = Calendar.getInstance();
		
		String am_pm;
		int hour = cal.get(Calendar.HOUR_OF_DAY);		
		int minute = cal.get(Calendar.MINUTE);		
		int second = cal.get(Calendar.SECOND);		
// 		String am_Pm = cal.get(Calendar.AM_PM)==0?"AM":"PM";	//삼항연산자가 깔끔함
		
		if(cal.get(Calendar.AM_PM) == 0){
			am_pm="AM";
		} else {
			am_pm="PM";
		}
		String CT = hour+":"+minute+":"+second+am_pm;
		out.print("현재 시간은 "+CT+"<br>");
	%>
	<p><a href="6-2_response_data.jsp">Google 홈페이지로 이동하기</a></p>
	
</body>
</html>