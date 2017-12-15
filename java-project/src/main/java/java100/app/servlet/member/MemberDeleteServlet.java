package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
import java100.app.dao.ScoreDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/member/delete")
public class MemberDeleteServlet extends HttpServlet {
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
        response.setContentType("text/html;charset=UTF-8"); 
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<title>회원관리</title>");
        
        
        out.println("<link rel='stylesheet' href='../css/common.css'>");
      
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
         
        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        
        out.println("<h1>회원 삭제</h1>");
            
        
          try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
                  PreparedStatement pstmt = con.prepareStatement("delete from ex_memb where no = ?");
                  ) {
              
              pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
              
              if(pstmt.executeUpdate() > 0) {
                  
                 out.println("<p>삭제됬습니다.</p>");
               
              }else {
                  out.printf("<p>'%s'의 회원 정보가 없습니다.</p>\n", request.getParameter("no"));
                             
              }
                          
          } catch (Exception e) {
              e.printStackTrace();
              out.println(e.getMessage());
          }
          out.print("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
          
          rd = request.getRequestDispatcher("/footer");
          rd.include(request, response);
          
          out.print("</div>");
          
          out.print("<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>");
          out.print("<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>");
          out.print("<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>");
          
          out.print("</body>");
          out.print("</html>"); 
        }
        
       
    
    
}
