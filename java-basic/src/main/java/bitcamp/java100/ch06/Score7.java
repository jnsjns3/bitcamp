package bitcamp.java100.ch06;



//기본 생성자
// 클래스를 정의할  때 생성자를 만들지 않으면, 컴파일러가 파라미터가 없는 생성자를 자동으로 생성한다.
public class Score7 {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float ever;
   
    
    Score7(){
       
        this("홍길동");
        
     }
    
    Score7(String name){
        this(name, 50, 50, 50);
        
        /*
        this.name = name;
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        this.compute(); 
        */
    }
    
    Score7(String name, int kor, int eng, int math){
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
