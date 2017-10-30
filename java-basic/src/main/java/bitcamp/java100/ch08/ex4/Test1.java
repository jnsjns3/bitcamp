package bitcamp.java100.ch08.ex4;

//다형성 : 오버라이딩 사용전!
public class Test1 {

    
    public static void main(String[] args) {
        
         Score s1 = new Score(1, "홍길동", 100, 100, 100);
         Score s2 = new Score(1, "홍길동", 100, 100, 100);
         
         if(s1 != s2) {
             System.out.println("s1 과 s2의 주소는 다르다!");
         }
         
         
         if(s1.equals(s2)) {
             System.out.println("s1 과 s2의 내용은 같다!");
         }
      // Object의 equals()는 원래 같은 인스턴스인지를 검사한다.
      // 따라서 당연히 s1과 s2는 다른 인스턴스이기 떄문에 결과는 false 이다.
      // String.equals() 처럼 만들려면 오버라이딩 기법을 쓰면 된다.   
         
         
    }
}
