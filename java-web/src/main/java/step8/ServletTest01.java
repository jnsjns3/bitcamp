package step8;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step8/ServletTest01")
public class ServletTest01 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String school = req.getParameter("school");
        String address = req.getParameter("address");
        String money = req.getParameter("money");
        
        memberHello save = new memberHello();
        save.setName(name);
        save.setAge(age);
        save.setSchool(school);
        save.setAddress(address);
        save.setMoney(money);
        
        
        PrintWriter out = resp.getWriter();
        
        File file = new File("/step8/test.jpg");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        
        int b;
        while((b = in.read()) != -1) {
            out.println(b);
        }
        
        //out.println(save.toString()); 
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        
       
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Insert title here</title>");
        out.println("</head>");
        out.println("<body>");
            
        out.println("<h1>Member List</h1>");
        out.println("<p>"+save.getName()+"</p>");
        out.println("<p>"+save.getAge()+"</p>");
        out.println("<p>"+save.getSchool()+"</p>");
        out.println("<p>"+save.getAddress()+"</p>");
        out.println("<p>"+save.getMoney()+"</p>");
        
        out.println("</body>");
        out.println("</html>");
        
        
        
    }
    
    
}
