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
       
        memberTest mem = new memberTest();
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        int ent;
        
        String name = req.getParameter("name");
        String id = req.getParameter("id");
        String password = req.getParameter("password");
        
        mem.setName(name);
        mem.setId(id);
        mem.setPassword(password);
        
        System.out.println(mem.toString());
        
        out.println("저장되었습니다.");
       
}
}
