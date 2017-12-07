package step2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet를 상속받아서 쓰면 AbstractServlet 클래스와 같은 효과를 발휘한다
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step2/Servlet05")
public class Servlet05 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    System.out.printf("URL : %s\n",req.getRequestURL());
    System.out.printf("URI : %s\n",req.getRequestURI());
    System.out.printf("servlet path : %s\n",req.getServletPath());
    System.out.printf("path info : %s\n",req.getPathInfo());
    System.out.printf("query string : %s\n",req.getQueryString());
        
}
    

    
    
    
}

