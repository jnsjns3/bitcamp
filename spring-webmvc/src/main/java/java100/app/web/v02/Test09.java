package java100.app.web.v02;

// @GetMApping, @PostMapping
// HTTP 클라이언트가 요구하는 콘텐츠의 MINE 타입
// 웹서버는 가능한 클라이언트가 요구하는 타입의 콘테츠를 우선으로 보내준다.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test09")
public class Test09 {

    
    @GetMapping
    public String m1() {
        
        System.out.println("get()");
        return "/hello.jsp";
    }
   
    //@RequestMapping(method=RequestMethod.POST)
    @PostMapping
    public String m2() {
        
        System.out.println("post()");
        return "/hello.jsp";
    }
  

   
    
    
    
}
