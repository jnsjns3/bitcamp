package step1;

//Servlet 배치 URL
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//src/main/webapp/WEB-INF/web.xml

@WebServlet("/step1/Servlet03/")
public class Servlet03 implements javax.servlet.Servlet {
  //init()에서 받은 파라미터값을 저장하는 변수
    ServletConfig config;
  
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        
        
    }

    @Override
    public void destroy() {  }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //클라이언트가 요청할때마다 출력됨
        System.out.println("step1.servlet03.service()");
        
    }
    
    @Override
    public ServletConfig getServletConfig() {
     
        return this.config;
    }

    

    @Override
    public String getServletInfo() {
       
       
        return "setvlet03 - XML 파일에 서블릿 배치 정보 등록";
    }

    

    
    
    
}

