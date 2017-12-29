package java100.app.web.v02;

import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.google.gson.Gson;

@Controller
@RequestMapping("/v02/test17")
public class Test17 {

    // 테스트 하는 방법
    // => http://localhost:9999/spring-webmvc/v02/test17.html
    
    
    // 클라이언트가 보낸 application/json 데이터를 받아서 객체로 만들기
    // 
    @RequestMapping("/m1")
    public String m1(@RequestBody String json) {
        // JSON 문자열 => 자바 객체 (변환해주는 라이브러리를 설치해야 한다. gson-2.8.2.jar)
        
        @SuppressWarnings("rawtypes")
        Map obj =new Gson().fromJson(json, Map.class);
        
        System.out.printf("name=%s\n", obj.get("name"));
        System.out.printf("age=%f\n", obj.get("age"));
        System.out.printf("tel=%s\n", obj.get("tel"));
        System.out.printf("email=%s\n", obj.get("email"));
        
        System.out.println("-----------------------------");
        return "/hello.jsp";
    }
   
    
    class User{
        String name;
        int age;
        String tel;
        String email;
    }
    
    @RequestMapping("/m2")
    public String m2(@RequestBody String json) {
        // JSON 문자열 => 자바 객체 (변환해주는 라이브러리를 설치해야 한다. gson-2.8.2.jar)
        
        
        User user =new Gson().fromJson(json, User.class);
        
        System.out.printf("name=%s\n", user.name);
        System.out.printf("age=%d\n", user.age);
        System.out.printf("tel=%s\n", user.tel);
        System.out.printf("email=%s\n", user.email);
        
        System.out.println("-----------------------------");
        return "/hello.jsp";
    }
    
    public static class User2{
        String name;
        int age;
        String tel;
        String email;
        
        public User2() {}
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getTel() {
            return tel;
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        
        
        
    }
    
    // 스프링에서 제공하는 Message COnverter를 이용하여 Json 문자열을 자동으로 자바 객체로 바꾸기
    // 이 예제에서는 <mvc:annotation-driven/>를 이용해서 메시지 컨버터를 기본 등록시켜서 활용한다
    @RequestMapping(value="/m3")
    public String m3(@RequestBody User2 user) {
        
        
        System.out.printf("name=%s\n", user.getName());
        System.out.printf("age=%d\n", user.getAge());
        System.out.printf("tel=%s\n", user.getTel());
        System.out.printf("email=%s\n", user.getEmail());
        
        System.out.println("-----------------------------");
        return "/hello.jsp";
    }
  
    
}

