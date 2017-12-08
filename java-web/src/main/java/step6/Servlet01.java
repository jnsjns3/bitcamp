package step6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 초기화 파라미터
@SuppressWarnings("serial")
//@WebServlet("/step6/Servlet01") 
public class Servlet01 extends HttpServlet{

   //<== DD File에 배치 정보가 있기 떄문에 제거한다.
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    // 서블릿 설정 정보를 다루는 객체를 이용해서 xml값을 꺼내라
    
    ServletConfig config = this.getServletConfig();
    String driver = config.getInitParameter("driver");
    String url = config.getInitParameter("url");
    
    
    res.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = res.getWriter();
   
    System.out.println(driver);
    System.out.println(url);
   out.println(driver);
   out.println(url);
   
    
}
    

    
    
    
}

