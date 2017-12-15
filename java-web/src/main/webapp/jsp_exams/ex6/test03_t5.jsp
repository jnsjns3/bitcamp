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
scope 지정하기.
보관소를 지정하지 않으면 기본이 PageContext이다.
scope는 보관소를 지정하는 명령어다.

<jsp:useBean id="list1" class="java.util.ArrayList"></jsp:useBean>
<jsp:useBean id="list2" class="java.util.ArrayList" scope="request"></jsp:useBean>

<%--
java.util.Arraylist<String> list = pageContext.getAttribute("list);

if(list == null){
  없으면 생성
}
 --%>
<h3>PageCOntext 보관소</h3> 
list1 : <%=pageContext.getAttribute("list1") %> 
list2 : <%=pageContext.getAttribute("list2") %> 

<h2>ServletRequest 보관소</h2>
list1 : <%=request.getAttribute("list1") %> 
list2 : <%=request.getAttribute("list2") %> 
</body>
</html>

