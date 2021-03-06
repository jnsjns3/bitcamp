package bitcamp.java100.TestmeSi.Testme1;
import java.util.Scanner;

public class ScoreSample extends Controll {
    
    protected String name;
    protected int[] subjects; 
    protected int sum;
    protected float aver;


    public ScoreSample(){
        this.subjects = new int[3];
    }
    
    
    public ScoreSample(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[]{kor, eng, math};
        
        this.compute();
    }
    
    
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
            ScoreSample aa = new ScoreSample();
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
