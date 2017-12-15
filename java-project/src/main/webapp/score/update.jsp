<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

        <%
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
 
     
        PrintWriter out2 = response.getWriter();
        %>
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
        <h1>성적 변경</h1>
    
        <% 
            try {
                
                Score score = new Score();
                score.setNo(Integer.parseInt(request.getParameter("no")));
                score.setName(request.getParameter("name"));    
                score.setKor(Integer.parseInt(request.getParameter("kor")));
                score.setEng(Integer.parseInt(request.getParameter("eng")));
                score.setMath(Integer.parseInt(request.getParameter("math")));
                
                    
               scoreDao.update(score);
              
               
                
                if(scoreDao.update(score) > 0) {
                %>
                    <p>변경하였습니다.</p>
                <%  
                }else {
                 %>   
                 <p>'<%=score.getNo()%>'의 성적 정보가 없습니다.</p>
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