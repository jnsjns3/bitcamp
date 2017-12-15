<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='common.css'>
<%!
 public int a;


%>
</head>
<%!
{
    this.a = 100;
    this.b = 200;
}
%>
<body>
<h1>선언부 테스트</h1>
<p>
JSP 페이지의 어느 위치에 와도 상관없다.<br>
어차피 서블리 클래스 선언부에 그대로 복사될 것이다.<br>
그렇다고 이 소스처럼 아무데나 퍼뜨리면 유지보수 하기 곤란하다<br>
</p>
<%!
   private int m() {
    return a + b;   
    
}

%>
<%= m() %>
</body>
<%!
public int b;
%>
</html>


