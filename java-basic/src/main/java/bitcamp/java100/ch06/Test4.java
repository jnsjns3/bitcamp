package bitcamp.java100.ch06;

public class Test4 {

//생성자 호출하기
// new () <-생성자
public static void main(String[] args) {
        
        Score3 score;
        score = new Score3();
        
       
        score.compute();
        System.out.printf("이름 %s\n",score.name);
        System.out.printf("이름 %s\n",score.sum);
        System.out.printf("이름 %s\n",score.ever);
        
        
    }
    
}
