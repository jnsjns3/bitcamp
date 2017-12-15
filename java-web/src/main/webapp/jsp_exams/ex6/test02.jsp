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

<h1>jsp:include</h1>
RequestDispatcher의 include()와 같은 기능을 수행한다.

<jsp:include page="test2_p1.jsp"/>
<hr>
<jsp:include page="test2_p2.jsp"/>

<h2>종류</h2>
<%--
<jsp:useBean id=""></jsp:useBean>
<jsp:param value="" name=""/>
<jsp:output></jsp:output>
<jsp:include page=""></jsp:include>
<jsp:forward page=""></jsp:forward>

 --%>


</body>
</html>

