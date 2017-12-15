
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

        <% 
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
        response.setContentType("text/plain;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out2 = response.getWriter();
        %>       
        <!DOCTYPE html>
        <html>
        <head>
        <link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
        <link rel='stylesheet' href='../css/common.css'>
        <title>성적관리</title>
        
        
        
       
        <title>성적관리</title>
        </head>
        <body>
        <div class='container'>
         <jsp:include page="/header.jsp"></jsp:include>
        <h1>성적 상세정보</h1>
       
       
        
        <% 
        try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            Score score = scoreDao.selectOne(no);
            
            if(score != null) {
         %>
                <form action='update' method='post'>
                <div class='form-group row'>
                <label for='no' class='col-sm-2 col-form-label'>번호</label>
                <div class='col-sm-10'>
                
                <input class='form-control' readonly id='no' type='number' name='no' value='<%=score.getNo()%>'>
                         
                </div>
                </div>
                
                <div class='form-group row'>
                <label for='name' class='col-sm-2 col-form-label'>이름</label>
                <div class='col-sm-10'>
                <input class='form-control' id='name' type='text' name='name' value='<%=score.getName()%>'>
                </div>
                </div>
                
                <div class='form-group row'>
                <label for='kor' class='col-sm-2 col-form-label'>국어</label>
                <div class='col-sm-10'>
                <input class='form-control' id='kor' type='number' name='kor' value='<%=score.getKor()%>'>
                </div>
                </div>
                <div class='form-group row'>
                <label for='eng' class='col-sm-2 col-form-label'>영어</label>
                <div class='col-sm-10'>
                <input class='form-control' id='eng' type='number' name='eng' value='<%=score.getEng()%>'>
                </div>
                </div>
                <div class='form-group row'>
                <label for='math' class='col-sm-2 col-form-label'>수학</label>
                <div class='col-sm-10'>
                <input class='form-control' id='math' type='number' name='math' value='<%=score.getMath()%>'>
                </div>
                </div>
                <div class='form-group row'>
                <label for='sum' class='col-sm-2 col-form-label'>합계</label>
                <div class='col-sm-10'>
                <input class='form-control' readonly id='sum' type='text' value='<%=score.getSum()%>'>
                </div>
                </div>
                <div class='form-group row'>
                <label for='aver' class='col-sm-2 col-form-label'>평균</label>
                <div class='col-sm-10'>
                <input class='form-control' readonly id='aver' type='text' value='<%=score.getAver()%>'>
                </div>
                </div>
                <div class='form-group row'>
                <div class='col-sm-10'>
                <button class='btn btn-primary btn-sm'>변경</button>
                <a href='delete?no=<%=score.getNo()%>' class='btn btn-primary btn-sm'>삭제</a>
                </div>
                </div>
                </form>
                
              
           <%  
           
           }else {
               
                out2.printf("'%d' 의 성적 정보가 없습니다.\n", no);
                           
             }
           %>
       <%     
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        %> 
        <jsp:include page="/footer.jsp"></jsp:include>
        
        </div>
        
       <%@ include file="../jslib.txt" %>
        
        </body>
        </html>
