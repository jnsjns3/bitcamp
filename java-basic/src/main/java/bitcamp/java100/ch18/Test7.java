package bitcamp.java100.ch18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Test7 {

    public static void main(String[] args) throws Exception {
        
        
        Class<?> clazz = X.class;
        
        
        X obj = (X)clazz.newInstance(); //X클래스에 대한 생성자 출력
        System.out.println(obj);
        System.out.println("--------------------");
        Constructor<?> constructor = clazz.getConstructor(int.class);
        
        obj = (X)constructor.newInstance(10);
        System.out.println(obj);
        
        constructor = clazz.getConstructor(String.class ,int.class);
        obj = (X)constructor.newInstance("홍길동", 20);
        System.out.println(obj);
    }
    
}
