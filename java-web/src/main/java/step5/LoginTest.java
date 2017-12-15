package step5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/step5/LoginTest")
public class LoginTest extends HttpServlet {

    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       
        memberTest mem = new memberTest();
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
    
        String id = req.getParameter("id");
        String password = req.getParameter("password");
        
        if(!(id.equals(mem.getId()) && password.equals(mem.getPassword()))) {
            out.println("잘못된 아이디와 암호입니다.");
            
        }
        
        System.out.println(mem.toString());
        
        out.println("저장되었습니다.");
       
}
}
