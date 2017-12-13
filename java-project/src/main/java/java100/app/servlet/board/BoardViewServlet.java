package java100.app.servlet.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.BoardDao;
import java100.app.domain.Board;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/board/view")
public class BoardViewServlet extends HttpServlet {

   
        @Override
        protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
       
            BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
            out.println("<title>성적관리</title>");
            out.println("<style>");
            out.println(".container {");
            out.println(" width: 680px;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='container'>");
            out.println("<h1>게시물 상세정보</h1>");
            
            
            try {
                
                int no = Integer.parseInt(request.getParameter("no"));
                Board board = boardDao.selectOne(no);
                
                if(board != null) {
                    out.println("<form action='update' method='post'>");
                    out.println("<div class='form-group row'>");
                    out.println("<label for='no' class='col-sm-2 col-form-label'>번호</label>");
                    out.println("<div class='col-sm-10'>");
                    out.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n", 
                                board.getNo());
                    out.println("</div>");
                    out.println("</div>");
                    
                    out.println("<div class='form-group row'>");
                    out.println("<label for='title' class='col-sm-2 col-form-label'>제목</label>");
                    out.println("<div class='col-sm-10'>");
                    out.printf("<input class='form-control' id='title' type='text' name='title' value='%s'>\n", 
                                board.getTitle());
                    out.println("</div>");
                    out.println("</div>");
                    
                    
                    out.println("<div class='form-group row'>");
                    out.println("<label for='conts' class='col-sm-2 col-form-label'>내용</label>");
                    out.println("<div class='col-sm-10'>");
                    out.printf("<input class='form-control' id='conts' type='text' name='conts' value='%s'>\n", 
                                board.getContent());
                    out.println("</div>");
                    out.println("</div>");
                    
                    
                    out.println("<div class='form-group row'>");
                    out.println("<label for='regdt' class='col-sm-2 col-form-label'>날짜</label>");
                    out.println("<div class='col-sm-10'>");
                    out.printf("<input class='form-control' id='regdt' type='text' name='regdt' value='%s'>\n", 
                                board.getRegDate());
                    out.println("</div>");
                    out.println("</div>");
                    
                    
                    out.println("<div class='form-group row'>");
                    out.println("<label for='no' class='col-sm-2 col-form-label'>조회수</label>");
                    out.println("<div class='col-sm-10'>");
                    out.printf("<input class='form-control' readonly id='vwcnt' type='number' name='vwcnt' value='%d'>\n", 
                                board.getViewCount());
                    out.println("</div>");
                    out.println("</div>");
                    
                    out.println("<div class='form-group row'>");
                    out.println("<div class='col-sm-10'>");
                    out.println("<button class='btn btn-primary btn-sm'>변경</button>");
                    out.printf("<a href='delete?no=%d' class='btn btn-primary btn-sm'>삭제</a>\n", board.getNo());
                    out.println("</div>");
                    out.println("</div>");
                   
                    out.println("</form>");
                    
                  
                 
               }else {
                    out.printf("<p>'%d' 의 게시물 정보가 없습니다.</p>\n", no);
                               
                 }
                            
            } catch (Exception e) {
                e.printStackTrace();
                out.println(e.getMessage());
            }
            out.print("</div>");
            out.print("</body>");
            out.print("</html>");
       }
           
        
        
 
    
    
}
