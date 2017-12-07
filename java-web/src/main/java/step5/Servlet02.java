package step5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// HttpServlet를 상속받아서 쓰면 AbstractServlet 클래스와 같은 효과를 발휘한다
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step5/Servlet02")
public class Servlet02 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    
    //URL에 포함된 데이터를 꺼내기
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
   
    out.printf("name: %s\n", req.getParameterValues("name"));
    
    out.println("----------------------------------------------");
    //모두 꺼내고 싶다면?
    String[] values =req.getParameterValues("name");
    for(String value : values) {
        out.printf("name : %s\n", value);
    }
    
    out.println("----------------------------------------------");
    //파라미터의 이름을 모두 꺼내고싶다면
    
   Enumeration<String> names = req.getParameterNames();
    while(names.hasMoreElements()) {
        String name = names.nextElement();
        out.printf("%s, %s\n", name, req.getParameter(name));
    }
}
    

    
    
    
}

