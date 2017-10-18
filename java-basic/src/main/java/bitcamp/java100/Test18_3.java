package bitcamp.java100;

public class Test18_3{
    
  public static void main(String[] args) {
    
    String s1 = "ABC가각간";
    String s2 = "ABC가각간";
    String s3 = "ABC가각간";

    String s4 = new String("ABC가각간");
    String s5 = new String("ABC가각간");
    String s6 = new String("ABC가각간");
    
    //이유? 리터럴을 이용하여 암시적으로 String 인스턴스를 만들 떄는 String pool 이라는 별도의 영역에 인스턴스가 생성된다.
    
    if(s1 == s2) {
        System.out.println("s1 == s2");    
    }
    if(s1 == s4) {
        System.out.println("s1 == s4");    
    }
    if(s1 == s5) {
        System.out.println("s1 == s5");    
    }
    
    
    
    
    
    
    
    if(s3 == s2) {
        System.out.println("s3 == s2");
    }
    if(s4 != s5) {
        System.out.println("s4 != s5");
    }
    if(s5 != s6) {
        System.out.println("s5 != s6");
    }
    
    
}
        

   
}

   