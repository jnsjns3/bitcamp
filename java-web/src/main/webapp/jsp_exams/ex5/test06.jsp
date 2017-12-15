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

<h1>include</h1>
<p>jsp 페이지에 다른 파일의 내용을 포함시킬때 사용한다 </p>

<pre class="jsp">
&lt;%@ include file="URL"%>

</pre>

<p>
   JSP 엔진이 JSP 파일을 가지고 서블릿 클래스로 만들기 전에
   먼저 include 태그에 지정된 파일을 가져온다.
   그런 후에 서블릿 클래스 만들기를 수행한다.
   서블릿의 including 방식으로 동작하는 것이 아님에 주의하라!
   인클루딩은 반드시 그 대상이 서블릿이나 jsp 이어야 하고,
   파일의 내용을 가져오는 것이 아니라 서블릿(jsp)를 실행하는 것이다
  
</p>
</body>
</html>

