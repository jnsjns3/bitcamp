package java100.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.w3c.dom.DOMError;

import java100.app.AppConfig;
import java100.app.dao.ScoreDao;
import java100.app.domain.Room;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/hello/*")
public class HelloServlet extends HttpServlet {
    
    
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
            switch (request.getPathInfo()) {
        case "/hi":
            this.doHi(request, response); break;
        case "/hi2":
            this.doHi2(request, response); break;
        
      
        default:
            DoError(request, response);
            
        }
            
    
    }
    private void DoError(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println(" <head>");
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("<h1>요청오류</h1>");
        out.println("<p>요청하신 URL의 서비스를 찾을수 없습니다! </p>");
        out.println("</html>");
        
        
    }
    private void doHi(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
       
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println(" <head>");
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("<h1>Hi~~~~~</h1>");
        out.println("<p>hihi! </p>");
        out.println("</html>");
       
    }
    
    private void doHi2(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println(" <head>");
        out.println("</head>");
        out.println("<body>");
        out.println("</body>");
        out.println("<h1>Hi22222</h1>");
        out.println("<p>hihi~~~~~~~~~~~~~~~~~~~~~~~~~ </p>");
        out.println("</html>");
        
       
            
          
   }
   
    
}
