package bitcamp.java100.ch06;

public class Test8 {

// 오버로딩!
// 다양한 파라미터값을 받는 메서드 생성
public static void main(String[] args) {
        
    Score7 score;
    score = new Score7();
    
    System.out.printf("이름 %s\n",score.name);
    System.out.printf("총점 %d\n",score.sum);
    System.out.printf("평균 %f\n",score.ever);
    
    
    }
    
}
