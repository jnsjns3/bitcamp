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

<h1>표현식</h1>
<p>JSP 페이지에 어떤 명령의 결과를 출력하는 출력문을 만들 떄 사용한다. </p>
<%
int age = 18;

%>
나이: <%=(age < 19) ? "미성년" : "성년" %> 입니다.

<h2>생성된 자바 코드</h2>
<%-- 미성년 입니다. --%>



</body>
</html>

