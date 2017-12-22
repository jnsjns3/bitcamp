package java100.app.web.v02;

// Accept 요청 헤더
// HTTP 클라이언트가 요구하는 콘텐츠의 MINE 타입
// 웹서버는 가능한 클라이언트가 요구하는 타입의 콘테츠를 우선으로 보내준다.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test08")
public class Test08 {

    
    @RequestMapping(produces="text/csv")
    public String m1() {
        
        System.out.println("m1()");
        return "/hello.jsp";
    }
    // aaa헤더가 있는경우
    @RequestMapping(produces="application/json")
    public String m2() {
        
        System.out.println("m2()");
        return "/hello.jsp";
    }
    // command라는 파라미터가 있는경우
    @RequestMapping()
    public String m3() {
        
        System.out.println("m3()");
        return "/hello.jsp";
    }

   
    
    
    
}
