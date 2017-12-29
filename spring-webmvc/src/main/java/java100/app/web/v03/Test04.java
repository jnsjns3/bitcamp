package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// @RestController
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v03/test04")
public class Test04 {

    
    
    @RequestMapping(value="/m1")
    @ResponseBody
    public Object m1() {
       
        // ResponeseBody // @RestController에 정의된 요청 핸들러가 일반객체를 리턴할때 @ResponeseBody를 붙일 필요가 없다.
        return new Member("홍길동", 20, true);
    }
  
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")@ResponseBody
    public String m2() {
       
        // ResponeseBody // @RestController에 정의된 요청 핸들러가 일반객체를 리턴할때 @ResponeseBody를 붙일 필요가 없다.
        return "Hello!!안녕";
    }
  
   
    
    
}

