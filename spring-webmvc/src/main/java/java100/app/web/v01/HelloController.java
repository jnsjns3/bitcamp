package java100.app.web.v01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // <== DispatcherSErvlet?? ?�� ?��?��?��?��?��?�� 붙�? ?��?��?���?? ?��?�� ?��?��?��?��.
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "/hello.jsp";
    }
    
    
}
