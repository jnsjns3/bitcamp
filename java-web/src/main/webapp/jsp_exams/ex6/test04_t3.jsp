
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
pageContext는 JSP 페이지 마다 존재한다.
<%
pageContext.setAttribute("aaa");
pageContext.getAttribute("aaa");

%>
*보관소 종류 4개*
ServletContext
HttpServletd 브라우저당 업무수행
ServletRequest 1개의 요청당 업무수행
ServletRequest(JSP) 1개의 요청을 수행하고 사라지고 다시 생성됨

<h1>jsp:setProperty 연습</h1>
get프로퍼티를 사용하는 경우에는 useBean을 통해 객체를 생성해야만 사용할 수 있다
단 객체는 변수가 아닌 보관소에 저장되어 있어야한다.<br>
결론 : jsp:getproperty나 jsp:getProperty를 호출할 떄는 주로 
jsp:useBean 으로 만든 객체를 다룰떄이다,


<jsp:useBean id="m" class="domain.Member">
    <jsp:setProperty name="m" property="name" value="홍길동"/>
    <jsp:setProperty name="m" property="age" value="20"/>
    <jsp:setProperty name="m" property="working" value="true"/>
    
</jsp:useBean>
<p>
이름 : <jsp:getProperty name="m" property="name"/><br>
나이 : <jsp:getProperty name="m" property="age"/><br>
재직자 : <jsp:getProperty name="m" property="working"/><br>
</p>

</body>
</html>

