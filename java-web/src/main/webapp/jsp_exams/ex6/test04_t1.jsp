
<%@page import="domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    
    %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='common.css'>
</head>

<body>

<h1>jsp:setProperty 연습</h1>
객체에 대해 셋터/겟터 메서드를 호출할 때 사용한다.
단 객체는 변수가 아닌 보관소에 저장되어 있어야한다.

<%
 Member m = new Member();

%>

<jsp:setProperty name="m" property="name" value="홍길동">

Member 객체 내용
<%=m.toString()%>

</body>
</html>

