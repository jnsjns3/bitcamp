package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// GET/POST 요청을 구분하여 처리하는 경우 3
@SuppressWarnings("serial")
@WebServlet("/step8/Servlet07") 
public class Servlet07 extends HttpServlet{

   
// HtppServlet 클래스는 이미 GET 요청과 POST 요청 등을 구분하여 내부에서 만든 메서드를 호출하도록 이미 프로그래밍 되어 있다.
    
   
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
     
      req.setCharacterEncoding("UTF-8");
      res.setContentType("text/plain;charset=UTF-8");
      PrintWriter out = res.getWriter();
      
      out.printf("이름 : %s\n", req.getParameter("name"));
      out.printf("나이 : %s\n", req.getParameter("age"));
      out.printf("사진1 : %s\n", req.getParameter("photo1"));
      out.printf("사진2 : %s\n", req.getParameter("photo2"));
      
    }
    
   
    
    
    
}

