package step2;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step2/Servlet03")
public class Servlet03 extends GenericServlet{

@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.printf("클라이언트 IP : %s\n",req.getRemoteAddr());
        System.out.printf("클라이언트 포트 : %s\n",req.getRemotePort());
        HttpServletRequest request = (HttpServletRequest) req;
        
        System.out.printf("URL : %s\n",request.getRequestURL());
        System.out.printf("URI : %s\n",request.getRequestURI());
        System.out.printf("servlet path : %s\n",request.getServletPath());
        System.out.printf("path info : %s\n",request.getPathInfo());
        System.out.printf("query string : %s\n",request.getQueryString());
        
}
    

    
    
    
}

