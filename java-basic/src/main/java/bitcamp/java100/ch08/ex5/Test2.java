package bitcamp.java100.ch08.ex5;

//다형성 : compute() 오버라이딩 사용후!
public class Test2 {

    
    public static void main(String[] args) {
        
         ScoreEx2 s1 = new ScoreEx2(1, "홍길동", 100, 100, 100, 80, 80);
         
         
         System.out.printf("합계=%d\n", s1.getSum());
         System.out.printf("평균=%f\n", s1.getAver());
 
         
         
         
    }
}
