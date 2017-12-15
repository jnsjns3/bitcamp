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
@WebServlet("/step9/Servlet03") 
public class Servlet03 extends HttpServlet{

   

@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
    //포워딩은 인클루딩과 다르게 한번 가면 돌아오지 않는다. 값이 버려짐
    req.setCharacterEncoding("UTF-8");
    
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("servlet03에서 출력하였슴");
        
        RequestDispatcher rd = req.getRequestDispatcher("/step9/OtherServlet");
        rd.forward(req, res);
        
    
}
    

    
    
    
}

