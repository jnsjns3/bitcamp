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
<pre class="jsp">

<%
int a = 10;
int b = 20;
out.printf("%d + %d = %d</p>\n", a,b, a + b);
%>
</pre>
<pre class="java">

<%
int a = 10;
int b = 20;
out.printf("%d + %d = %d</p>\n", a,b, a + b);
%>
</pre>




</body>
</html>