package step7;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 정적 자원과 동적 자원의 만남
@SuppressWarnings("serial")
@WebServlet("/step7/Servlet03") 
public class Servlet03 extends HttpServlet{

   
    
@Override
public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    //HTML을 웹 브라우저에 보낼 떄는 MINE 타입으로 알려줘야 한다.
    int a =Integer.parseInt(req.getParameter("a"));
    int b =Integer.parseInt(req.getParameter("b"));
    String op = req.getParameter("op");
    
    
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
   
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset=\'UTF-8\'>");
    out.println("<title>계산기</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>계산결과</h1>");
    out.println("<p>");
    out.printf("%d %s %d = ",a, op, b);
    
    switch (op) {
    case "+": out.println(a + b); break;
    case "-": out.println(a - b); break;
    case "*": out.println(a * b); break;
    case "/": out.println(a / b); break;
    case "%": out.println(a % b); break;
    
    default: out.println("지원하지 않는 연산자 입니다!");
        
    }

    //이전 양식으로 돌아가는 링크를 추가한다.
    out.println("<a href='Servlet03.html'>다시계산</a>");
    
    
    out.println("<p>");
    out.print("</body>");
    out.println("</html>");
    
    
}
    

    
    
    
}

