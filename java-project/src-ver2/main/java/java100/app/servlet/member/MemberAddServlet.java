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
@WebServlet(urlPatterns="/member/add")
public class MemberAddServlet extends HttpServlet {
    
    

    
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
        
        Member member = new Member();
        member.setName(request.getParameter("name"));    
        member.setEmail(request.getParameter("email"));
        member.setPassword(request.getParameter("pwd")); 
             
        memberDao.insert(member);
        
        response.sendRedirect("list");
        
            
          
   }
   
        
       
    
    
}
