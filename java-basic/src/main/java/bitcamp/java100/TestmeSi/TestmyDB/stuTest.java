package bitcamp.java100.TestmeSi.TestmyDB;

public class stuTest {

    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    
    void count(){
      this.sum = this.kor + this.eng + this.math;
      
    }

    
    @Override
    public String toString() {
        return "stuTest [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + "]";
    }


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
        count();
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        count();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
        count();
    }

    public int getSum() {
        return sum;
    }
    
    
}
