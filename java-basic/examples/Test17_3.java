package bitcamp.java100;



public class Test17_3{

    //void : 값을 리턴하지 않음을 표시한다.
    //String name을 파라미터 라고 한다.
    static void m1(String name) {
        System.out.printf("%s님 반갑습니다! \n", name);
    }
    
    static void m2(String name, int age) {
        System.out.printf("%s(%d)님 반갑습니다. \n", name, age);
    }
    
   public static void main(String[] args) {

       // ex) "홍길동"을 아규먼트(argument)라 부른다.
       m1("홍길동");
       m1("임꺽정");
       m1("유관순");
       
       m2("홍길동", 20);
       m2("임꺽정", 30);
       m2("유관순", 16);
       
}
    
    
}
    

   