package step4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet를 상속받아서 쓰면 AbstractServlet 클래스와 같은 효과를 발휘한다
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step4/Servlet02")
public class Servlet02 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    res.setContentType("text/plain;charset=UTF-8");
     PrintWriter out =res.getWriter();
    out.println("ABC가각간abc똘똠똥123");
    
    
}
    

    
    
    
}

