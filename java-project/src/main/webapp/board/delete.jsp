<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
response.setContentType("text/html;charset=UTF-8");
PrintWriter out2 = response.getWriter();
%>    
<!DOCTYPE html>
<html>
<head>
<title>게시물관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp"></jsp:include>
<h1>게시물 삭제</h1>
<%
try {
    int no= Integer.parseInt(request.getParameter("no"));
    
    
    if(boardDao.delete(no) > 0) {
%>    
<p>삭제됬습니다.</p>
<%     
    }else {
%>         
<p>'<%=no%>' 의 게시물 정보가 없습니다.</p>
<%                  
    }
                
} catch (Exception e) {
    e.printStackTrace();
    out.println(e.getMessage());
}

%>

<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
<jsp:include page="/footer.jsp"></jsp:include>
</div>
<%@ include file="../jslib.txt" %>
</body></html>