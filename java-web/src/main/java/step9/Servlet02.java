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

// 다른 서블릿에게 요청을 전달하기 - forwarding
@SuppressWarnings("serial")
@WebServlet("/step9/Servlet02") 
public class Servlet02 extends HttpServlet{

   

@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    //인클루딩과 다르게 한번 가면 돌아오지 않는다.
    req.setCharacterEncoding("UTF-8");
    
    String op = req.getParameter("op");
    switch (op) {
    case "+":
        RequestDispatcher rd = req.getRequestDispatcher("/step9/PlusServlet");
        rd.forward(req, res);
        break;
    case "-":
        rd = req.getRequestDispatcher("/step9/MinusServlet");
        rd.forward(req, res);
        break;

    default:
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.printf("'%s' 이 연산자는 지원하지 않습니다.\n",op);
        break;
    }
    
    
}
    

    
    
    
}

