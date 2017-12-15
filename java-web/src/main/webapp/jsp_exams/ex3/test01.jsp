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
<pre class="jsp">
&lt;%= 20 + 30%>
</pre>

<h2>생성된 자바 코드</h2>

<pre class="java">
out.println(20+30);
</pre>



</body>
</html>

