<%@page import="java100.app.domain.Member"%>
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
        <title>회원관리</title>
        <link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
        
        <link rel='stylesheet' href='../css/common.css'>
        
        </head>
        <body>
        <div class='container'>
         <jsp:include page="/header.jsp"></jsp:include>
        <h1>회원정보 변경</h1>
        <% 
        try {
            
            Member member = new Member();
            member.setNo(Integer.parseInt(request.getParameter("no")));
            member.setName(request.getParameter("name"));    
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("pwd"));
            
            memberDao.update(member);
         %> 
           <p>저장하였습니다.</p>
          <% 
            if(memberDao.update(member) > 0) {
                %>       
                <p>변경하였습니다.</p>
          <%      
            }else {
                %>       
                <p>'<%=member.getNo()%>'의 성적 정보가 없습니다.</p>
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
