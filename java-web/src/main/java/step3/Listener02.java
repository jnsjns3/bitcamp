package step3;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

// 리스너 : 서블릿 컨테이너에 특정 사건이 발생했을 떄 보고받는 역할을 한다.
@WebListener // <-- 따로 URL을 지정하지 않는다
public class Listener02 implements ServletRequestListener{

    
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
       // 이 메서드는 클라이언트 요청이 들어오면 호출된다
        System.out.println("Listener02.requestInitialized()");
        
        //이 메서드에서 요청 기록을 남기는 일을 할 수 있다.
        //즉 요청 상황을 모니터링 할때 유용하다.
        
    }
    
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Listener02.requestDestroyed()");
        
        
    }

    

    
  

    
    
}
