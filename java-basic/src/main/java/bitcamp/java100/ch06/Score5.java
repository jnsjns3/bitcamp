package bitcamp.java100.ch06;



// 오버로딩
// 데이터 타입과 파라미터의 갯수와 순서만 다르다면 여러개의 메서드를 만들 수 있다. 이것을 오버로딩이라 함
public class Score5 {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float ever;
   
    Score5(){
        System.out.println("Score3() 호출됨");
         
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
     }
    
    Score5(String name){
        System.out.println("Score5 String 호출됨");
        this.name = name;
    }
    
    Score5(String name, int kor, int eng, int math){
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
