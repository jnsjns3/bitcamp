package bitcamp.java100;

public class Test18_2{
    
  public static void main(String[] args) {
    
    String s1;
    
    s1 = "ABC가각간";
    
    String s2 = "ABC가각간";
    
    //리터럴 : 문자 그대로 라는 뜻
    if(s1 == s2) {
        System.out.println("s1 == s2");
    }
      
    //이유? 리터럴을 이용하여 암시적으로 String 인스턴스를 만들 떄는 String pool 이라는 별도의 영역에 인스턴스가 생성된다.
}
        

   
}

   