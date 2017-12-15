package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

// 파일 업로드 2
@SuppressWarnings("serial")
@WebServlet("/step8/Servlet09") 
public class Servlet09 extends HttpServlet{

   
// HtppServlet 클래스는 이미 GET 요청과 POST 요청 등을 구분하여 내부에서 만든 메서드를 호출하도록 이미 프로그래밍 되어 있다.
    
   
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        MultipartRequest multi = new MultipartRequest(req, "C:\\saveD");
        
        String name = multi.getParameter("name");
        String age = multi.getParameter("age");
        String photo1Filename = multi.getFilesystemName("photo1");
        String photo2Filename = multi.getFilesystemName("photo2");
        
        System.out.println("전송완료");
        
      req.setCharacterEncoding("UTF-8");
      res.setContentType("text/plain;charset=UTF-8");
      PrintWriter out = res.getWriter();
      
      
      out.printf("이름 : %s\n", name);
      out.printf("나이 : %s\n", age);
      out.printf("사진1 : %s\n", photo1Filename);
      out.printf("사진2 : %s\n", photo2Filename);
      
    }
    
   
    
    
    
}

