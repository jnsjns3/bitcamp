package step3;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

// 웹 애플리케이션 멤버 - Filter
// 클라이언트 요청이 들어왔을떄 서블릿을 실행하기 전 후에 어떤 작업을 수행하는 일을 한다.

// 필터를 어느요청에 꼽아야 할지 지정해야 한다.
@WebFilter(urlPatterns="/step3/Servlet01")
public class Filter01 implements javax.servlet.Filter {

    // init()에서 받은 파라미터 값을 보관한다.
    FilterConfig config;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       //필터는 서블릿과 달리 서블릿 컨테이너를 실행할떄 미리 생성되고 이 메서드도 미리 호출된다.
        
        System.out.println("Filter01.init");
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
       //서블릿의 service()를 호춣하기전에 먼저 실행된다.
        //연결 고리에서 다음에 필터가 있으면 그 필터를 실행하고 없으면 최종목적지인 서블릿을 실행한다.
        
        System.out.println("Filter01.doFilter()-before");
        chain.doFilter(request, response);
        
        System.out.println("Filter01.doFilter()-after");
    }

    @Override
    public void destroy() {
       
        System.out.println("Filter01.destroy()");
    }

    
    
}
