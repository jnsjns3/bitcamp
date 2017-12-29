package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;


//세션 다루기 - @SessionAttributes 애노테이션 사용하기
@Controller
@RequestMapping("/v03/test07")
@SessionAttributes({"name","age"})
public class Test07 {

    
    
    
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    public String m1(Model model) {
       
        model.addAttribute("name", "임꺽정");
        model.addAttribute("age", 20); // Auto-boxing : Integer 객체 저장
        model.addAttribute("working", true);
        
        
        return "v03/test07/m1";
    }
    
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m2(@ModelAttribute("name") String name, 
                     @ModelAttribute("age") int age) {
       
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
        
       
        
        return buf.toString();
    }
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(@ModelAttribute String name, 
                     @ModelAttribute int age) {
       
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
        
       
        
        return buf.toString();
    }
    
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(@ModelAttribute("working") String working) {
       
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working=%s\n", working));
        
       
        
        return buf.toString();
    }
    
    @RequestMapping(value="/m5", produces="text/plain;charset=UTF-8")
    public String m5() {
       
       // 즉 여기에서 Model 객체에 name과 age 값을 저장하지 않더라도,
       // 세션에 보관된 값 중에서 @SessionAttributes에 지정된 값은 JSP를 실행하기 전에 ServletRequest에 담아준다
        return "v03/test07/m1";
    }
    
}

