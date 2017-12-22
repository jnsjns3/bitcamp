package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test12")
public class Test12 {

    
    //프론트 컨트롤러가 줄수잇는 파라미터
    
    
    @RequestMapping("m1")
    public String m1(String name, int age, boolean working, float height) {
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(height);
        System.out.println("----------------------");
        return "/hello.jsp";
    }
    
    //기본 타입외에 다른타입으로 형변환을 요구하면 프론트 컨트롤러는 오류를 발생시킨다.
    @RequestMapping("m2")
    public String m2(Date birthDate) {
        
        System.out.println(birthDate);
        
        return "/hello.jsp";
    }
    
    // 프론트 컨트롤러는 클라이언트로 부터 요청이 들어오면 클아이너트가 보낸 데이터를 적절하게 변환하기 위해
    // 변환기를 셋팅한다.
    // 스프링 문자열은 primitive 타입으로 바꿀 수 있도록 기본 변환기를 제공한다.
    // 그 외의 타입은 개발자가 만들어 셋팅해야 한다.
    // @InitBinder가 붙은 메서드는 프론트 컨트롤러가 문자열을 바꾸기 전에 WebDataBinder를 설정하기 위해 호출하는 메서드이다.
    
    //파라미터 마다 호출된다.
    /*
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        System.out.println("initBinder()");
        // 문자열을 날짜 객체로 만들어줄 도구를 준비한다.
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); //날짜 형식을 엄격하게 검사하라
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
    */
    
}
