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
<jsp:useBean id="list" class="java.util.ArrayList"></jsp:useBean>
<%--
java.util.Arraylist<String> list = pageContext.getAttribute("list);

if(list == null){
list = new java.util.ArrayList<String>();
// 생성한 객체는 PageContext 보관소에 저장한다.
pageContext.setAttribute("list",list);
}
 --%>
 
 <%
 list.add("홍길동");
 list.add("임꺽정");
 list.add("유관순");
 
 %>
 
리스트 개수: <%=list.size() %>

<%
ArrayList list2 = (ArrayList)pageContext.getAttribute("list");
%>

<h2>확인결과</h2>
list2.get(1) : <%=list2.get(1) %>
</body>
</html>

