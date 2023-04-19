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
<%-- 	<%!  --%>
<!--  		public String calDate(){ -->
<!--  			Calendar cal = Calendar.getInstance(); -->
<!--  			return (cal.get(Calendar.YEAR)-1)+"-" -->
<!--  				+(cal.get(Calendar.MONTH)-1)+"-" -->
<!--  				+(cal.get(Calendar.DATE)-3); -->
<!--  		} -->
<%-- 	%> --%>
<%-- 	1년 2달 3일전 =<%= calDate() %> --%>
<!-- 	ok -->

<!-- 	강사님 답 -->
	<%!
		public String calDate(){
			Calendar calendar = Calendar.getInstance();
			int year=0;
			int month=0;
			int days=0;
			
			calendar.add(Calendar.YEAR,-1);
			calendar.add(Calendar.MONTH,-2);
			calendar.add(Calendar.DATE,-3);
			
			year = calendar.get(Calendar.YEAR);
			month = calendar.get(Calendar.MONTH)+1;
			days = calendar.get(Calendar.DATE);
			
			return year+"-"+month+"-"+days;
	}
	%>
	1년 2달 3일전 =<%= calDate() %>
</body>
</html>