package java100.app.domain;
import java.util.Scanner;

import java100.app.controll.CSVFormatException;

//: ## 생성자와 인스턴스 메서드 도입
//: - init() 메서드 대신 생성자를 이용하여 인스턴스를 초기화시킨다.
//: - print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신
//:   인스턴스 메서드로 전환한다. 
//: 캡슐화 문법을 적용하라!
//: setter / getter의 정의와 사용을 연습한다!

public class Score {
    
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    
    protected int sum;
    protected float aver;

    
    //: ### 생성자 
    // public으로 공개한다. 다른 패키지에서도 호출할수 있도록 변경!
    public Score(){
       
    }
    
    
    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", aver="
                + aver + "]";
    }

    
    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        
        this.compute();
    }
    
    public String toCSVString() {
        return String.format("%s,%d,%d,%d,%d,%f\n", 
                this.getName(),
                this.getKor(),
                this.getEng(), 
                this.getMath(),
                this.getSum(),
                this.getAver());
    }
    
    public Score(String scv) throws CSVFormatException {
        String[] rec = scv.split(",");
        if(rec.length < 4) {
           throw new CSVFormatException("CSV 데이터 항목의 개수가 올바르지 않습니다.");
        }
        try {
        this.name = rec[0];
        this.kor = Integer.parseInt(rec[1]);
        this.eng = Integer.parseInt(rec[2]);
        this.math = Integer.parseInt(rec[3]);
        this.compute();
        }catch(Exception e) {
            throw new CSVFormatException("CSV 데이터 항목의 형식이 올바르지 않습니다.");
        }
        }
     
    
    //: ### 인스턴스 메서드
    //: 인스턴스 데이터를 다루는 메서드는 스태틱 보다 인스턴스 메서드로 선언해야 한다.
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getKor() {
        return kor;
    }


    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }


    public int getEng() {
        return eng;
    }


    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }


    public int getMath() {
        return math;
    }


    public void setMath(int math) {
        this.math = math;
        this.compute();
    }


    public int getSum() {
        return sum;
    }


    public float getAver() {
        return aver;
    }


    // 내부에서만 사용할 메서드이기 때문에 공개하지 않는다.
    private void compute() {
        this.sum=this.kor + this.eng + this.math;
        
        
        
        this.aver = (float)this.sum / 3f;
    }
    
    //전체공개할 메서드는 public으로 공개한다.
    
    
    
    public void printDetail() {
        
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",   
                    this.name, 
                    this.kor, 
                    this.eng, 
                    this.math, 
                    this.sum, 
                    this.aver);
        
        
    }
    
    
}
