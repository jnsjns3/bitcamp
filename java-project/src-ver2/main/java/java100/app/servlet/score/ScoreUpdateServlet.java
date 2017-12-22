package java100.app.servlet.score;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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

//클라이언트가 /score/로 시작하는 URL을 요청할 떄 이 서블릿을 실행하라고 표시한다.
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/score/update")
public class ScoreUpdateServlet extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
       
        
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
        
        Score score = new Score();
        score.setNo(Integer.parseInt(request.getParameter("no")));
        score.setName(request.getParameter("name"));    
        score.setKor(Integer.parseInt(request.getParameter("kor")));
        score.setEng(Integer.parseInt(request.getParameter("eng")));
        score.setMath(Integer.parseInt(request.getParameter("math")));
        
        scoreDao.update(score);
        
        // 변경후 목록 페이지를 요청한다.
        response.sendRedirect("list");
        
        
       
   }

   
    
   
    
    
}
