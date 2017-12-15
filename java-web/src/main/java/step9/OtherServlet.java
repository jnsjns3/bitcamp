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

// 이 서블릿을 ㅗ포워딩 하기 전에 출력한 내용은 버려진다.
@SuppressWarnings("serial")
@WebServlet("/step9/OtherServlet") 
public class OtherServlet extends HttpServlet{

   

@Override
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    
   
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("OtherServlet 에서 출력하였슴");
        
        
        
    
}
    

    
    
    
}

