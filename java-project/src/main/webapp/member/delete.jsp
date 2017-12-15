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
        <title>회원관리</title>
        
        
        <link rel='stylesheet' href='../css/common.css'>
      
        </head>
        <body>
        <div class='container'>
         <jsp:include page="/header.jsp"></jsp:include>
        <h1>회원 삭제</h1>
            
       <% 
        try {
            int no= Integer.parseInt(request.getParameter("no"));
            
            
            if(memberDao.delete(no) > 0) {
                %>
                      
               <p>삭제됬습니다.</p>
               
            <%   
            }else {
             %>   
                '<%=no%>' 의 성적 정보가 없습니다.</p>
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
          
          </body>
          </html> 