package step9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 이 페이는 상단 메뉴를  출력하는 서블릿
@SuppressWarnings("serial")
@WebServlet("/step9/HeaderServlet") 
public class HeaderServlet extends HttpServlet{

   

@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
 
    //이 서블릿을 포함하는 쪽에서 콘텐츠의 타입을 결정하기 떄문에 따로 설정할 필요는 없다.
    //req.setCharacterEncoding("UTF-8");
  
    PrintWriter out = res.getWriter();
    
    out.println("<header>");
    out.println("<p>페이지 상단 부분!</p>");
    
    out.println("</header>");
    
    
}
    

    
    
    
}

