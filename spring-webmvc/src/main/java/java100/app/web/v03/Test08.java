package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


//세션 다루기 - 세션 무효화 시키기
@Controller
@RequestMapping("/v03/test08")
@SessionAttributes({"name","age"})
public class Test08 {

    
    
    
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public String m1(HttpSession session, Model model) {
       
        model.addAttribute("name", "임꺽정");
        model.addAttribute("age", 20); // Auto-boxing : Integer 객체 저장
        model.addAttribute("working", true);
        
        session.setAttribute("working", true);
        
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    public String m2(HttpSession session) {
       
        session.invalidate();
        
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m3")
    public String m3(SessionStatus status) {
       
        status.setComplete();
        // setComplete()을 호출하면, @SessionAttributes로 지정한 값만 제거한다.
        
        return "v03/test08/m1";
    }
    
    @RequestMapping(value="/m4")
    public String m4(SessionStatus status, HttpSession session) {
       
        status.setComplete();
        session.invalidate();
        
        return "v03/test08/m1";
    }
    
}

