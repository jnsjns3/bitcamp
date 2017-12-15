package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/member/update")
public class MemberUpdateServlet extends HttpServlet {
    
   
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);
        response.setContentType("text/html;charset=UTF-8"); 
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>회원관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        
        out.println("<link rel='stylesheet' href='../css/common.css'>");
        
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
         
        RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response);
        
        out.println("<h1>회원정보 변경</h1>");
        
        try {
            
            Member member = new Member();
            member.setNo(Integer.parseInt(request.getParameter("no")));
            member.setName(request.getParameter("name"));    
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("pwd"));
            
            memberDao.update(member);
          
           out.println("<p>저장하였습니다.</p>");
            
            if(memberDao.update(member) > 0) {
                out.println("<p>변경하였습니다.</p>");
            }else {
                out.printf("<p>'%s'의 성적 정보가 없습니다.</p>\n", member.getNo());
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
