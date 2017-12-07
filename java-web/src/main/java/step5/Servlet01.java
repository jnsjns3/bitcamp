package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet를 상속받아서 쓰면 AbstractServlet 클래스와 같은 효과를 발휘한다
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step5/Servlet01")
public class Servlet01 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    
    //URL에 포함된 데이터를 꺼내기
    // http://localhost:9999/java-web/step5/Servlet01?name=%EC%95%88%EC%A4%91%EA%B7%BC&age=20&working=yes
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
   
    out.printf("이름: %s\n", req.getParameterValues("name"));
    out.printf("나이: %s\n", req.getParameterValues("age"));
    out.printf("재직: %s\n", req.getParameterValues("working"));
    
    
}
    

    
    
    
}

