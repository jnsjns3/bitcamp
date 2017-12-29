package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
//프론트 컨트롤러에게 리턴할수 있는 값의 타입


@Controller
@RequestMapping("/v03/test01")
public class Test01 {

    // 테스트 하는 방법
    // => http://localhost:9999/spring-webmvc/v02/test17.html
    
    // 요청핸들러의 리턴값
    // View 컴포넌트 URL을 리턴하는 경우
    // ViewResolver의 종류?
    // => XmlViewResolver : XML 파일로 뷰 정보를 관리한다.
    // => ResourceBundleViewResolver : .properties 파일로 뷰 정보를 관리한다.
    // => InternalResourceViewResolver : URL 경로를 이용하여 뷰 정보를 관리한다.
    // => FreeMarkerViewResolver : Free Maker 템플릿 엔진을 통해 뷰를 실행 및 관리한다.
    // => ContentNegotiatingViewResolver : 여러 ViewResolver를 중계해주는 역할 수행.
    
    
    @RequestMapping("/m1")
    public String m1() {
       
        // 만약 기본 ViewResolver를 다른 것으로 교체하면 
        return "v03/test01/m1";
    }
    
    // 다음의 메서드는 app-servlet.xml 설정에서 view url - prefix + 요청핸들러의 rul + postfix = / + /v03/test01/m2 + .jsp 앞에 이중으로 붙은 / 는 제거된다.
    // 그래서 따로 리턴을 하지 않아도 m2.jsp를 불러온다.
    @RequestMapping("/m2")
    public void m2() {
       System.out.println("Test01.m2()");
    }
    
    @RequestMapping("/m3")
    public View m3() {
       System.out.println("Test01.m3()");
       
       View view = new InternalResourceView("/v03/test01/m3.jsp");
       return view;
    }
    
   
  
    
}

