<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %> 
<%
// 	응답이 정상적으로 된 상태로 설정
	response.setStatus(HttpServletResponse.SC_OK);
%>   
에러발생
<br>
<!-- 오류에 대한 기본 메시지 -->
<!-- isErrorPage="true" 가 있어야 사용 가능 -->
<!-- 웹 사이트에서 페이지를 표시할 수 없습니다. -->
<%= exception.getMessage()%>