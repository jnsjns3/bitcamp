package java100.app.web.v03;

import javax.servlet.http.HttpServletResponse;

import org.omg.PortableServer.POAPackage.WrongAdapter;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//프론트 컨트롤러에게 리턴할수 있는 값의 타입


@Controller
@RequestMapping("/v03/test02")
public class Test02 {

    
    
    @RequestMapping("/m1")
    @ResponseBody
    public String m1() {
       
        // ResponseBody를 붙이면 리턴값은 클라이언트로 그대로 출력된다. 
        return "hello";
    }
  
    @RequestMapping("/m2")
    @ResponseBody
    public String m2(HttpServletResponse response) {
       
        //response.setContentType("text/plain;charset=UTF-8");
        //response.setCharacterEncoding("UTF-8");
        //response.setHeader("Content-Type", "text/plain;charset=UTF-8"); 전부 안된다.
        //이유 : 프론트 컨트롤러에서 Content-Type의 헤더를 설정하기 떄문이다.
        
       
        return "한글!";
    }
    
    //한글 출력? 
    // 다음 메서드는 클라이언트가 test/plain MIME 타입의 데이터를 요구하고 그 데이터가 UTF-8로 인코딩 되길 원할때 호출되는 메서드이다.
    // 그런데 프론트 컨트롤러가 리턴 값을 출력할 때 이 조건을 분석하여 설정된 MIME 타입의 문자집합으로 인코딩한다.
    // 단 다른 조건이 붙을 때 문자집함이 처리되지 않는 상황이 발생할 수 있다.
    
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(HttpServletResponse response) {
       
        return "한글!";
    }
   
    @RequestMapping(value="/m4")
    @ResponseBody
    public HttpEntity<String> m4() {
       
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        
        HttpEntity<String> entity = new HttpEntity<>("한글!", headers);
        
        
        return entity;
    }
    
    @RequestMapping(value="/m5")
    public ResponseEntity<String> m5() {
       
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        ResponseEntity<String> entity = new ResponseEntity<>("한글!", headers, HttpStatus.OK);
        
        
        return entity;
    }
    
    
    @RequestMapping(value="/m6")
    @ResponseBody
    public Object m6() {
       
        
        // 만약 리턴값이 일반 자바 객체라면 Message Converter에 등록된 변환기가 가동되어 
        // JSON 형식의 문자열로 바뀌어 출력된다.
       return new Member("홍길동", 20, true); 
    }
    
}

