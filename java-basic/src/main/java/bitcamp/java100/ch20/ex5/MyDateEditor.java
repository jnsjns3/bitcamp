package bitcamp.java100.ch20.ex5;

import java.beans.PropertyEditorSupport;
import java.sql.Date;


//이 메서드는 문자열을 셋터가 원하는 타입으로 바꿀필요가 있을 떄 ㅅ프링 IoC 컨테이너에 의해 호출된다.
public class MyDateEditor extends PropertyEditorSupport {

    
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
     
        this.setValue(Date.valueOf(text)); 
        
 }

    
    
}
