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
<h1>JSP 주요 구성요소</h1>
<h1>템플릿 데이터</h1>
<p>JSP 파일에 그냥 작성하는 모든 텍스트는 자바의 출력 코드로 만들어진다.</p>

<h2>JSP 템플릿 데이터</h2>
<pre class="jsp">
    안녕하세요!
    JSP에 오신걸 환영합니다.
    
</pre>

<h2>생성된 자바 코드</h2>
<pre class="java">
out.write("안녕하세요!\n");
out.write("JSP에 오신걸 환영합니다!\n");

    
</pre>
<h2>JSP를 공부하는 방법</h2>
<p>JSP의 각 구성요소가 자바의 어떤 코드로 만들어지는지 이해하는 것이다!</p>
<p>그냥 작성하는 텍
</body>
</html>