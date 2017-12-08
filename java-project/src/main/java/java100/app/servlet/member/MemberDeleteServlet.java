package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
        response.setContentType("text/plain;charset=UTF-8"); 
        PrintWriter out = response.getWriter();
      
          try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
                  PreparedStatement pstmt = con.prepareStatement("delete from ex_memb where no = ?");
                  ) {
              
              pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
              
              if(pstmt.executeUpdate() > 0) {
                  
                 out.println("삭제됬습니다.");
               
              }else {
                  out.printf("%s 의 회원 정보가 없습니다.\n", request.getParameter("no"));
                             
              }
                          
          } catch (Exception e) {
              e.printStackTrace();
              out.println(e.getMessage());
          }
           
        }
        
       
    
    
}
