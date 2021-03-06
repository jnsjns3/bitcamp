package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/v02/test13")
public class Test13 {

    // 테스트 하는 방법
    // => http://localhost:9999/spring-webmvc/v02/test13.html
    
    
    // 클라이언트가 멀티파트 형식으로 보낸 데이터를 파라미터 받기
    // 
    @RequestMapping
    public String fileupload(
            String name,
            int age,
            boolean working,
            MultipartFile photo) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(photo.getOriginalFilename());
        System.out.println("--------------------");
        return "/hello.jsp";
    }
}
