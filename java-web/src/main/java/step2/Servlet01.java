package step2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/step2/Servlet01")
public class Servlet01 extends AbstractServlet{
  

@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("step2");
    
}
    

    
    
    
}

