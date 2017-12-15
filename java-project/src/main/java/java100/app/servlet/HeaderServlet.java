package java100.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.AppConfig;
import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

//인클루딩 할 떄 이전 서블릿이 GET이면 같은 방식으로 GET 요청 한다.
//인클루딩 할 떄 이전 서블릿이 POST이면 같은 방식으로 POST 요청 한다.
//모두 대응할수 있또록 가능한 service()를 오버라이딩 하라.

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/header")
public class HeaderServlet extends HttpServlet {
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
      
        
    
        PrintWriter out = response.getWriter();
       
        
         
        out.println("<header>");
        out.println(" <nav class='navbar navbar-expand-lg navbar-light bg-light'>");
        out.println("<a class='navbar-brand' href='#'>");
        out.println("<img src='../images/bootstrap-solid.svg' width='30' height='30' class='d-inline-block align-top' alt=''>");
        out.println("비트캠프");
        out.println("</a>");
        
        out.println("<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNavDropdown' aria-controls='navbarNavDropdown' aria-expanded='false' aria-label='Toggle navigation'>");
        out.println("<span class='navbar-toggler-icon'>");
        out.println(" </button>");
        out.println("<div class='collapse navbar-collapse' id='navbarNavDropdown'>");
        out.println("<ul class='navbar-nav'>");
        out.println("<li class='nav-item active'>");
        out.println("<a class='nav-link' href='../score/list'>성적</a>");
         
        out.println("</li>");
        out.println("<ul class='navbar-nav'>");
        out.println("<li class='nav-item active'>");
        out.println("<a class='nav-link' href='../member/list'>회원</a>");
        
        out.println("</li>");
        out.println("<ul class='navbar-nav'>");
        out.println("<li class='nav-item active'>");
        out.println(" <a class='nav-link' href='../board/list'>게시판</a>");
       
        out.println("</li>");
        out.println("<ul class='navbar-nav'>");
        out.println("<li class='nav-item active'>");
        out.println("<a class='nav-link' href='../room/list'>강의실</a>");
      
        out.println("</li>");
        out.println("</div>");
        out.println("</nav>");
    
        out.println("</nav>");
        out.println("</header>");
        
      
   }

    
   
    
    
}
