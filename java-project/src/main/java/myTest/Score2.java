package myTest;
import java.util.Scanner;

//: ## 생성자와 인스턴스 메서드 도입
//: - init() 메서드 대신 생성자를 이용하여 인스턴스를 초기화시킨다.
//: - print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신
//:   인스턴스 메서드로 전환한다. 
//: 캡슐화 문법을 적용하라!
//: setter / getter의 정의와 사용을 연습한다!

public class Score2 {
    
    protected String name;
    protected int[] subjects; 
    protected int sum;
    protected float aver;

    
    //: ### 생성자 
    // public으로 공개한다. 다른 패키지에서도 호출할수 있도록 변경!
    public Score2(){
        this.subjects = new int[3];
    }
    
    
    public Score2(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[]{kor, eng, math};
        
        this.compute();
    }
    
     
    
    //: ### 인스턴스 메서드
    //: 인스턴스 데이터를 다루는 메서드는 스태틱 보다 인스턴스 메서드로 선언해야 한다.
    
    // 내부에서만 사용할 메서드이기 때문에 공개하지 않는다.
    private void compute() {
        for (int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float)this.sum / this.subjects.length;
    }
    
    //전체공개할 메서드는 public으로 공개한다.
    public void print() {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                this.name, 
                this.subjects[0], 
                this.subjects[1], 
                this.subjects[2], 
                this.sum, 
                this.aver);
    }
    public void printa(String nA) {
         if(nA.equals(this.name)) {
             System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                     this.name, 
                     this.subjects[0], 
                     this.subjects[1], 
                     this.subjects[2], 
                     this.sum, 
                     this.aver);
         }
        
    }
    public void suJung(String nA) {
        Scanner sc = new Scanner(System.in);
        if(nA.equals(this.name)) {
            Score2 aa = new Score2();
            System.out.println("이름?");
            aa.name = sc.nextLine();
            
            System.out.println("국어?");
            aa.subjects[0] = sc.nextInt();
            
            System.out.println("영어?");
            aa.subjects[1] = sc.nextInt();
            System.out.println("수학?");
            aa.subjects[2] = sc.nextInt();
            
            this.compute();
            System.out.println("변경하시겠습니까?(y/n)");
            String check = sc.next();
            if(check.equals("y")) {
                this.name = aa.name;
                this.subjects[0] = aa.subjects[0];
                this.subjects[1] = aa.subjects[1];
                this.subjects[2] = aa.subjects[2];
                this.compute();
                
            }else {
                aa = null;
            }
            
        }
       
   }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름?");
        this.name = sc.nextLine();
        
        System.out.println("국어?");
        this.subjects[0] = sc.nextInt();
        System.out.println("영어?");
        this.subjects[1] = sc.nextInt();
        System.out.println("수학?");
        this.subjects[2] = sc.nextInt();
        
        this.compute();
        
    }
}
