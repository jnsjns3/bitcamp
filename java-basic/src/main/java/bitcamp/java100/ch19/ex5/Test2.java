package bitcamp.java100.ch19.ex5;

import java.lang.annotation.Annotation;

public class Test2 {

    public static void main(String[] args) {
        
        MyAnnotation1 anno =MyClass2.class.getAnnotation(MyAnnotation1.class);
        String[] names = anno.name();
        int[] ages = anno.age();
        
        for(String n : names) {
            System.out.println(n);
        }
        System.out.println("-------------------");
        
        for(int a : ages) {
            System.out.println(a);
        }
    }
    
}
