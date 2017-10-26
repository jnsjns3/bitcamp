package bitcamp.java100.ch7.ex4;

// Object 클래스의 주요 메서드
// toString()
//  -인스턴스의 내용을 문자열로 리턴한다.
// equals()
//  -인스턴스가 같은지 비교하여 true 또는 false 값을 리턴한다.
//hash값? 각 인스턴스를 구분할 때 사용할 디지털 지문!
// hashCode()
//  - hash 값만 따로 리턴한다.
// getClass()

public class Test2 {

    
    public static void main(String[] args) {
       
        Test2 obj = new Test2();
        Test2 obj2 = new Test2();
         
        
        System.out.println(obj.toString());
    
       System.out.println(Integer.toHexString(obj.hashCode())); // toHexString = 16진수로 표현
         
       System.out.println(obj.equals(obj2));
       System.out.println(obj.equals(obj));
       
       String s1 = new String("hello");
       String s2 = new String("hello");
    System.out.println("------------------------------------------------");   
       System.out.println(s1 == s2);
       System.out.println(s1.equals(s2));
       
    System.out.println("------------------------------------------------");   
       StringBuffer sb1 = new StringBuffer("hello");
       StringBuffer sb2 = new StringBuffer("hello");
       System.out.println(sb1.equals(sb2));
   
    System.out.println(obj.getClass());
    
    
    
    }
       
}
