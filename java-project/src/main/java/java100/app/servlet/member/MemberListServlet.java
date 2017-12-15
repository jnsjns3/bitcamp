package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/member/list")
public class MemberListServlet extends HttpServlet {
    
    
     @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
         MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
         response.setContentType("text/html;charset=UTF-8"); 
         PrintWriter out = response.getWriter();
        
         out.println("<!DOCTYPE html>");
         out.println("<html>");
         out.println("<head>");
         
         out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
         
         out.println("<link rel='stylesheet' href='../css/common.css'>");
        
         out.println("</head>");
         out.println("<body>");
         out.println("<div class='container'>");
          
         RequestDispatcher rd = request.getRequestDispatcher("/header");
         rd.include(request, response);
       
         out.println("<h1>회원 목록</h1>");
         
         out.println("<p><a href='form.jsp' class='btn btn-primary btn-sm'>추가</a></p>");
         
         out.print("<table class='table table-hover'>");
         out.print("<thead>");
         out.print("<tr>");
         out.print("<th>번호</th><th>이름</th><th>이메일</th><th>가입날짜</th>");
         out.print("</tr>");
         out.print("</thead>");
         out.print("<tbody>");
      
        
         try{
             List<Member> list = memberDao.selectList(); 
              
             for(Member member : list) {
                
                out.printf("<tr><td>%d</td><td>"
                        + "<a href='view?no=%d'>%s</a>"
                        + "</td><td>%s</td><td>%s</td></tr>\n",  
                        member.getNo(),
                        member.getNo(),
                        member.getName(),
                        member.getEmail(),
                        member.getCreateDate());
                
                       }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
         out.print("</tbody>");
         out.print("</table>");
         out.print("</body>");
         
         rd = request.getRequestDispatcher("/footer");
         rd.include(request, response);
         
         out.print("</div>");
         
         out.print("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
         out.print("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
         out.print("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
         
         out.print("</html>");
        
    }
  
     
    
    
}
