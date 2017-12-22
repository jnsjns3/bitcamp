package java100.app.servlet.score;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.domain.Score;
import java100.app.listener.ContextLoaderListener;

//클라이언트가 /score/로 시작하는 URL을 요청할 떄 이 서블릿을 실행하라고 표시한다.
@SuppressWarnings("serial")
@WebServlet("/score/list")
public class ScoreListServlet extends HttpServlet {
   
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
  
        
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(
                ScoreDao.class);
        
        List<Score> list = scoreDao.selectList();
        
        //작업한 결과를 jsp에게 넘겨주기 위해 ServletRequest 보관소에 저장한다.
        request.setAttribute("list", list);
        
        response.setContentType("text/html;charset=UTF-8");
        
        RequestDispatcher rd = request.getRequestDispatcher("/score/list.jsp");
        rd.include(request, response);
        
    }
    
   
    
    
}
