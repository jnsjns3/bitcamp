<%@page import="java100.app.domain.Board"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    

<!DOCTYPE html>
<html>
<%
BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
response.setContentType("text/html;charset=UTF-8");
PrintWriter out2 = response.getWriter();
%>
<head>
<title>게시물관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp"></jsp:include>
<h1>게시물 등록 결과</h1>
<%
try{
    Board board= new Board();
        board.setTitle(request.getParameter("title"));    
        board.setContent(request.getParameter("conts"));    
        
         
    boardDao.insert(board);
%>   
<p>저장하였습니다.</p>
<%    
} catch (Exception e) {
    e.printStackTrace();
    out.println(e.getMessage());
}
%>
<p>저장하였습니다.</p>
<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
<jsp:include page="/footer.jsp"></jsp:include>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>

    