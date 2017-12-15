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

<h1>JSP 코드 - tagib</h1>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <c:forTokens var="name" items="홍길동,임꺽정,유관순" delims=",">
    
  
    
</c:forTokens>
</body>
</html>

