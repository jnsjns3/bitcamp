package bitcamp.java100.ch06;

public class Test2 {
//클래스 문법 사용
    public static void main(String[] args) {
        
        Score score;
        score = new Score();
        
       
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        
        
        score.sum= score.kor + score.eng + score.math;
        score.ever = score.sum / 3f;
        
        
        
    }
    
}
