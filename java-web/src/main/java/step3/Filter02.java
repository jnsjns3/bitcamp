package step3;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//필터의 배치
//1) 애노테이션으로 배치하거나
//   @WebFilter(urlPatterns="/step3/*")
// DD파일에 배치할수 있다.
@WebFilter(urlPatterns="/step3/*")
public class Filter02 implements javax.servlet.Filter {

    // init()에서 받은 파라미터 값을 보관한다.
    FilterConfig config;
    
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
       //필터는 서블릿과 달리 서블릿 컨테이너를 실행할떄 미리 생성되고 이 메서드도 미리 호출된다.
        
        System.out.println("Filter02.init");
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
       //서블릿의 service()를 호춣하기전에 먼저 실행된다.
        //연결 고리에서 다음에 필터가 있으면 그 필터를 실행하고 없으면 최종목적지인 서블릿을 실행한다.
        
        System.out.println("Filter02.doFilter()-before");
        chain.doFilter(request, response);
        
        System.out.println("Filter02.doFilter()-after");
    }

    @Override
    public void destroy() {
       
        System.out.println("Filter02.destroy()");
    }

    
    
}
