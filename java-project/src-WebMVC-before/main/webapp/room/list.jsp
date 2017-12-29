<%@page import="java100.app.dao.DaoException"%>
<%@page import="java100.app.domain.Room"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.RoomDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>   
        
        <!DOCTYPE html>
        <html>
        <head>
        
        <link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
        
        <link rel='stylesheet' href='../css/common.css'>
        <title>성적관리</title>
        </head>
        <body>
        <div class='container'>
        
         <jsp:include page="/header.jsp"></jsp:include>
         
        <h1>강의실 목록</h1>
        
        <p><a href='form.do' class='btn btn-primary btn-sm'>추가</a></p>
        
        <table class='table table-hover'>
        <thead>
        <tr>
        <th>번호</th><th>지역</th><th>강의실명</th><th>수용인원</th><th></th>
        </tr>
        </thead>
        <tbody>
        
           <c:forEach items="${list}" var="room">  
                <tr>
                <td>${room.no}</td>
                <td>${room.location}</td>
                <td>${room.name}</td>
                <td>${room.capacity}</td>
                <td><a href='delete.do?no=${room.no}'>삭제</a></td>
                </tr>
            </c:forEach>
        
        </tbody>
        </table>
        
        <jsp:include page="/footer.jsp"></jsp:include>
        </div>
        
        <%@ include file="../jslib.txt" %>
        
        </body>
        </html>