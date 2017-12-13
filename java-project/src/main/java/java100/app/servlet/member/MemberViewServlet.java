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
@WebServlet(urlPatterns="/member/view")
public class MemberViewServlet extends HttpServlet {
    
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
        
        
        out.println("<style>");
        out.println(".container {");
        out.println(" width: 680px;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>회원 상세정보</h1>");
       
 try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            Member member = memberDao.selectOne(no);
            
            if(member != null) {
                
                out.println("<form action='update' method='post'>");
                out.println("<div class='form-group row'>");
                out.println("<label for='no' class='col-sm-2 col-form-label'>번호</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' readonly id='no' type='number' name='no' value='%d'>\n", 
                            member.getNo());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='name' class='col-sm-2 col-form-label'>이름</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='name' type='text' name='name' value='%s'>\n", 
                            member.getName());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='name' class='col-sm-2 col-form-label'>이메일</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='email' type='text' name='email' value='%s'>\n", 
                            member.getEmail());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='name' class='col-sm-2 col-form-label'>암호</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='pwd' type='password' name='pwd' value='%s'>\n", 
                            member.getPassword());
                out.println("</div>");
                out.println("</div>");
                
                out.println("<div class='form-group row'>");
                out.println("<label for='name' class='col-sm-2 col-form-label'>날짜</label>");
                out.println("<div class='col-sm-10'>");
                out.printf("<input class='form-control' id='regdt' type='text' name='regdt' value='%s'>\n", 
                            member.getCreateDate());
                out.println("</div>");
                out.println("</div>");
                
                
                out.println("<div class='form-group row'>");
                out.println("<div class='col-sm-10'>");
                out.println("<button class='btn btn-primary btn-sm'>변경</button>");
                out.printf("<a href='delete?no=%d' class='btn btn-primary btn-sm'>삭제</a>\n", member.getNo());
                out.println("</div>");
                out.println("</div>");
                out.println("</form>");
                
                
                
                
             
             
           }else {
                out.printf("<p>'%d' 의 회원 정보가 없습니다.</p>\n", no);
                           
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
