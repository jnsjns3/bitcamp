<%@page import="java.util.ArrayList"%>
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

<h1>jsp:useBean 테스트</h1>
타입과 클래스 구분하기

<jsp:useBean id="list" type="java.util.ArrayList" class="java.util.ArrayList"></jsp:useBean>
<%--
java.util.Arraylist<String> list = pageContext.getAttribute("list);

if(list == null){
  없으면 생성
}
 --%>
 

 
리스트 개수: <%=list.size() %>


</body>
</html>

