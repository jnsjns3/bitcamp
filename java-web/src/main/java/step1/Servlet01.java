package step1;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step1/Servlet01")
public class Servlet01 implements javax.servlet.Servlet {
  //init()에서 받은 파라미터값을 저장하는 변수
    ServletConfig config;
    
    public Servlet01() {
       System.out.println("step1.servlet01.Servlet01() 생성자");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        
        System.out.println("step01.init()");
        
        
    }

    @Override
    public void destroy() {
        // .close, .flush 와 같은 자원해제 기능을 담당하는 메서드
        System.out.println("step01.destroy()");
    
    }
    
    @Override
    public ServletConfig getServletConfig() {
      //init()에서 받은 파라미터를 그대로 리턴한다.
        System.out.println("step01.getServletConfig");
        return this.config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //클라이언트가 요청할때마다 출력됨
        System.out.println("step1.service()");
        
    }

    @Override
    public String getServletInfo() {
       
        System.out.println("step1.getServletInfo()");
        return "setvlet01";
    }

    

    
    
    
}

