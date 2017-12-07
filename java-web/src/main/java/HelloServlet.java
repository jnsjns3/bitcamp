import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns="/hello")
public class HelloServlet implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        
    }
 
    @Override
    public ServletConfig getServletConfig() {
        
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("안녕하세요!");
        out.println("adasd");
    }

    @Override
    public String getServletInfo() {
       
        return "hello servlet";
    }

    @Override
    public void destroy() {
       
        
    }
    
    
    
}
