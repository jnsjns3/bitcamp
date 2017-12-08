package java100.app.servlet.member;

import java.io.IOException;
import java.io.PrintWriter;

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
        response.setContentType("text/plain;charset=UTF-8"); 
        PrintWriter out = response.getWriter();
        
        out.println("[회원 정보 변경]");
        
        try {
            
            Member member = new Member();
            member.setNo(Integer.parseInt(request.getParameter("no")));
            member.setName(request.getParameter("name"));    
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("pwd"));
            
            memberDao.update(member);
          
           out.println("저장하였습니다.");
            
            if(memberDao.update(member) > 0) {
                out.println("변경하였습니다.");
            }else {
                out.printf("'%s'의 성적 정보가 없습니다.\n", member.getNo());
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
       
   }
 
        
       
    
    
}
