package java100.app.web.v02;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

// 문자열을 특정 타입의 값으로 변환하기
// 방법3: 
//  => WebBindingInitializer 구현체를 만든다.
public class Test12WebBindingInitializer implements WebBindingInitializer {

    @Override
    public void initBinder(WebDataBinder binder) {
       
            System.out.println("test12WebBinding");
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false); //날짜 형식을 엄격하게 검사하라
            binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
        
        
    }

    
    
    
    
}
