package java100.app.web.v02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test10")
public class Test10 {

    
    //프론트 컨트롤러가 줄수잇는 파라미터
    
    
    @RequestMapping("m1")
    public String m1(String name) {
        
        
        return "/hello.jsp";
    }
    @RequestMapping("m2")
    public String m2(HttpServletRequest request) {
        //프론트 컨트롤러가 줄수 잇는것을 요구해라 그럼 줄것이다.
        
        return "/hello.jsp";
    }
    @RequestMapping("m3")
    public String m3(HttpServletResponse response) {
        //프론트 컨트롤러가 줄수 잇는것을 요구해라 그럼 줄것이다.
        
        return "/hello.jsp";
    }
}
