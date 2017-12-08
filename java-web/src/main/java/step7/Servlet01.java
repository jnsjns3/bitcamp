package step7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HTML 출력하기
@SuppressWarnings("serial")
@WebServlet("/step7/Servlet01") 
public class Servlet01 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    //HTML을 웹 브라우저에 보낼 떄는 MINE 타입으로 알려줘야 한다.
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
   
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset=\'UTF-8\'>");
    out.println("<title>insert title</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Hello World!</h1>");
    out.print("</body>");
    out.println("</html>");
    
    
}
    

    
    
    
}

