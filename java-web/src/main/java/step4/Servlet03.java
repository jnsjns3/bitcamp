package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// MINE 타입 (Mulitipurpose Internet Mail)
// - 원래는 이메일을 전송할 떄 8비트 이상으로 전송해야 하는 멀티 바이트 문자나 바이너리 문자를 위해 형식을 알려주려고 만들었다.
// - 현재는 이메일 뿐만 아니라 웹, 인터넷 전체에서 콘텐츠를 전송할 때 그 콘텐츠가 무슨 콘텐츠인지 알려주기 위해 널리 사용되고 있다.
// - 콘텐츠를 받는 쪽에서는 상대편이 알려준 MINE 타입의 정보를 바탕으로 받은 데이터를 어떻게 처리할지 결정한다.

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step4/Servlet03")
public class Servlet03 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    
    res.setContentType("text/html;charset=UTF-8");
     PrintWriter out =res.getWriter();
    out.println("<html><body><h1>Hello</h1></body></html>");
    
    
}
    

    
    
    
}

