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

<h1>선언부</h1>
<p>서블릿 클래ㅡ에필드나 메서드를 만들 때 사용한다. </p>
서블릿 객체는 오직 한개만 생성되기 떄문에 필드도 한개만 생성된다.
<pre class="jsp">
&lt;%!
    public int a;
    private void m(){}
    static{}
  
</pre>

<pre class="java">
    public class test01_jsp extends HttpJspBase{
	    public int a;
	    private void m(){}
	    static{}
	    {}
    }
</pre>

</body>
</html>

