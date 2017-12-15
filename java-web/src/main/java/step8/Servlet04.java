package step8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// GET/POST 요청을 구분하여 처리하는 경우 3
@SuppressWarnings("serial")
@WebServlet("/step8/Servlet04") 
public class Servlet04 extends HttpServlet{

   
// HtppServlet 클래스는 이미 GET 요청과 POST 요청 등을 구분하여 내부에서 만든 메서드를 호출하도록 이미 프로그래밍 되어 있다.
    
   
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>계산기</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>계산기</h1>");


        out.println("<form action='Servlet04' method='POST'>");
        out.println("<input type='text' name='a' size='3'>");
        out.println("<select name='op'>");
        out.println("   <option>+</option>");
        out.println("   <option>-</option>");
        out.println("   <option>*</option>");
        out.println("   <option>/</option>");
        out.println("   <option>%</option>");
        out.println("</select>");
        out.println("<input type='text' name='b' size='3'>");
        out.println("<button>=</button>");
        out.println("</form>");

        out.println("</body>");
        out.println("</html>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
        int a =Integer.parseInt(req.getParameter("a"));
        int b =Integer.parseInt(req.getParameter("b"));
        String op = req.getParameter("op");
        
        
        res.setContentType("text/html;charset=UTF-8");
       
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
        out.println("<p>");
        //이전 양식으로 돌아가는 링크를 추가한다.
        out.println("<a href='Servlet04'>다시계산</a>");
        
        
        out.println("<p>");
        out.print("</body>");
        out.println("</html>");
    }
    
    
}

