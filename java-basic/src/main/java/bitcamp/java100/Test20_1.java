package bitcamp.java100;

public class Test20_1{
    
  public static void main(String[] args) {
    
      
     int i = 10; //primitive type 변수 
     
     Integer i2 = new Integer(10); // int wrapper 래퍼 클래스 사용
     int i3 = i2.intValue();
     float f1 = i2.floatValue();
     
     System.out.println(Integer.MIN_VALUE);
     System.out.println(Integer.MAX_VALUE);
     
     // Integer 클래스에는 문자열을 해석하여 int로 변환해주는 메서드도 있다.
     int value = Integer.parseInt("2345");
     System.out.println(value+100);
     
     // int 값을 2진수,8진수,16진수로 표현된 문자열로 바꾸는 메서드도 있다.
     System.out.println(Integer.toBinaryString(44036));
     System.out.println(Integer.toOctalString(44032));
     System.out.println(Integer.toHexString(44036));
     
     
  }
  
  
  }
  
  

        

   


   