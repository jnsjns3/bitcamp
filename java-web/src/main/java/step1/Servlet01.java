package step1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/step1/Servlet01")
public abstract class Servlet01 implements javax.servlet.Servlet {
  //init()에서 받은 파라미터값을 저장하는 변수
    ServletConfig config;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        
        
    }

    @Override
    public void destroy() {  }
    
    
    @Override
    public ServletConfig getServletConfig() {
     
        return this.config;
    }

    

    @Override
    public String getServletInfo() {
       
       
        return this.getClass().getName();
    }

    

    
    
    
}

