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
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/member/list")
public class MemberListServlet extends HttpServlet {
    
    
     @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
         MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
         response.setContentType("text/plain;charset=UTF-8"); 
         PrintWriter out = response.getWriter();
        
        out.println("[회원 목록]");
        
        try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
                PreparedStatement pstmt = con.prepareStatement("select no, name, email, regdt from ex_memb");
                ResultSet rs = pstmt.executeQuery();) {
            
            
            while(rs.next()) {
                
                out.printf("%d, %s, %s, %s\n",  
                        rs.getInt("no"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDate("regdt"));
                
                       }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        
    }
  
       
    
    
}
