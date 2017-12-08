package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step5/ServletTest")
public class ServletTest extends HttpServlet {

    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        int ent;
        
        int su1 = Integer.parseInt(req.getParameter("su1"));
        int su2 = Integer.parseInt(req.getParameter("su2"));
        String op = req.getParameter("op");
        out.println("aaa");
       
        
        switch (op) {
      
        case "-": out.println(ent = su1 - su2);
        break;
        default: out.println("지원하지 않는 연산자 입니다!");
        
    }
    
}
}
