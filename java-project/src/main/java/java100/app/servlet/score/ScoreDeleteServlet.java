package java100.app.servlet.score;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.listener.ContextLoaderListener;

//클라이언트가 /score/로 시작하는 URL을 요청할 떄 이 서블릿을 실행하라고 표시한다.
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/score/delete")
public class ScoreDeleteServlet extends HttpServlet {
  
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        
        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("[학생 삭제]");
        
        try {
            int no= Integer.parseInt(request.getParameter("no"));
            
            
            if(scoreDao.delete(no) > 0) {
                
               out.println("삭제됬습니다.");
             
            }else {
                out.printf("'%d' 의 성적 정보가 없습니다.\n", no);
                           
            }
                        
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        
        
       
   }

 
    
}
