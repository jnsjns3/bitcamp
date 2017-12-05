package java100.app.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import java100.app.AppInitServlet;
import java100.app.dao.ScoreDao;
import java100.app.domain.Room;

@WebServlet(urlPatterns="/hello/*")
public class HelloServlet extends ArrayList<Room> implements Servlet {
    
    ServletConfig servletConfig;

    @Override
    public void destroy() {
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
      
    }
    
    @Override
    public ServletConfig getServletConfig() {
        // TODO Auto-generated method stub
        return this.servletConfig;
    }
    
    @Override
    public String getServletInfo() {
        // TODO Auto-generated method stub
        return "인사 서블릿";
    }
    
    
    @Override
    public void service(ServletRequest request, ServletResponse response)throws ServletException, IOException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        httpResponse.setContentType("text/plain;charset=UTF-8");
        
            switch (httpRequest.getPathInfo()) {
        case "/hi":
            this.doHi(httpRequest, httpResponse); break;
        case "/hi2":
            this.doHi2(httpRequest, httpResponse); break;
        case "/hi3":
            this.doDelete(httpRequest, httpResponse); break;
            
      
        default:
            response.getWriter().println("해당 명령이 없습니다"); break;
            
        }
            
    
    }
    private void doHi(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        out.println("[hihihi]");
       
       
    }
    
    private void doHi2(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        out.println("[hihihihihihihi");
        
       
            
          
   }
   
    
    private void doDelete(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        out.println("[강의실 삭제]");
       
           
        }
        
        
  
    
    
}
