<%@page import="java100.app.domain.Member"%>
<%@page import="java.util.List"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

         <% 
         MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
         response.setContentType("text/html;charset=UTF-8"); 
         PrintWriter out2 = response.getWriter();
         %>
         
         <!DOCTYPE html>
         <html>
         <head>
         
         <link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
         
         <link rel='stylesheet' href='../css/common.css'>
        
         </head>
         <body>
         <div class='container'>
         
        <jsp:include page="/header.jsp"></jsp:include>
        
         <h1>회원 목록</h1>
         
         <p><a href='form.jsp' class='btn btn-primary btn-sm'>추가</a></p>
         
         <table class='table table-hover'>
         <thead>
         <tr>
         <th>번호</th><th>이름</th><th>이메일</th><th>가입날짜</th>
         </tr>
         </thead>
         <tbody>
      
        <%
         try{
             List<Member> list = memberDao.selectList(); 
              
             for(Member member : list) {
         %>      
                <tr>
                <td><%=member.getNo()%></td>
                <td><a href='view.jsp?no=<%=member.getNo()%>'><%=member.getName()%></a></td>
                <td><%=member.getEmail()%></td>
                <td><%=member.getCreateDate()%></td>
                </tr> 
            
        <%    
             }
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        } 
        %>
         
         </tbody>
         </table>
         </body>
         <jsp:include page="/footer.jsp"></jsp:include>
         </div>
         
         <%@ include file="../jslib.txt" %>
         
         </html>