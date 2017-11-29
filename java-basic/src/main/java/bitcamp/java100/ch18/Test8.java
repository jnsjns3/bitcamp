package bitcamp.java100.ch18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Test8 {

    public static void main(String[] args) throws Exception {
        
        
        Class<?> clazz = X.class;
        
        Method m = clazz.getMethod("m2");
        m.invoke(null); //스태틱 메서드이기 때문에 첫번쨰 파라미터는 null, m2()를 호출하기 떄문에 값을 넘길 필요가 없다.
        
        clazz.getMethod("m2", int.class).invoke(null, 100);
        
        //clazz.getMethod("m").invoke(null); // 인스턴스 주소를 넘기지 않으면 널포인트 익세셥 에러가 발생함.
        X obj = new X();
        clazz.getMethod("m").invoke(obj);
        clazz.getMethod("m", int.class).invoke(obj, 100);
        clazz.getMethod("m", int.class, String.class).invoke(obj, 100, "홍길동");
        
    }
    
}
