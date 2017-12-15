<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='common.css'>
</head>
<body>

<h1>스크립트릿</h1>
<p>JSP 페이지에 자바 코드를 넣을때 사용한다</p>

<h2>JSP 스크립트릿</h2>

<%
int a = 10;
int b = 20;
out.println(a + b);
%>
<p>스크립트릿이 선언된 그 위치, 그 순서 그대로 자바 소스 파일에 복사된다</p>





</body>
</html>