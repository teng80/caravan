<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean class="question.Rectangle" id="rectangle"></jsp:useBean>
<jsp:setProperty property="*" name="rectangle"/>

	<% 
 		out.print("(" + rectangle.getX() + ", " + rectangle.getY() + ")"
				+ rectangle.process());
 	%>