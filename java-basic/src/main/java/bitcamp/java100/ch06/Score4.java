package bitcamp.java100.ch06;

public class Score4 {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float ever;
   
    Score4(String name, int kor, int eng, int math){
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
