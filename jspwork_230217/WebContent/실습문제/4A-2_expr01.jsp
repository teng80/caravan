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
<%-- 	<% Calendar cal = Calendar.getInstance(); --%>
<%-- 		cal.add(Calendar.DATE,1); %>  --%>
<%-- 	<%= cal.getTime() %> --%>
<!-- 		ok -->

	<%!
		public String calDate(){
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE,1);
			
// 			String year = String.vlaueOf(cal.get(Calendar.YEAR));
// 			String month = String.vlaueOf(cal.get(Calendar.MONTH+1));
// 			String days = String.vlaueOf(cal.get(Calendar.DATE));
			
			int year = cal.get(Calendar.YEAR);
			int month = cal.get(Calendar.MONTH)+1;
			int days = cal.get(Calendar.DATE);		
			
			return year+"-"+month+"-"+days;
		}
	%> 
	내일 = <%= calDate() %>
</body>
</html>