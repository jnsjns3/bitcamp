package bitcamp.java100.ch06;



//기본 생성자
// 클래스를 정의할  때 생성자를 만들지 않으면, 컴파일러가 파라미터가 없는 생성자를 자동으로 생성한다.
public class Score6 {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float ever;
   
    
    Score6(){
       System.out.println("기본생성자 호출됨");
     }
    
    Score6(String name){
        System.out.println("Score5 String 호출됨");
        this.name = name;
    }
    
    Score6(String name, int kor, int eng, int math){
     System.out.println("Score5 String int int int 생성됨");
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
       
       this.compute();
    }
    
    void compute() {
        
        this.sum = this.kor + this.eng + this.math;
        this.ever = this.sum / 3f;
     
    }
    
    
}
