package bitcamp.java100;

import bitcamp.java100.Testme4.Student;

public class Test14_5{
 
    public static class Score {
        
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;

        void compute(){
       
            sum = kor+eng+math;
            aver = sum / 3.0f;
        

        }
    }
    public static void main(String[] args) {
        
            Score s1 = new Score();
            
            s1.name = "임꺽정";
            s1.kor = 100;
            s1.eng = 100;
            s1.math = 100;
            
            s1.compute();

            System.out.printf("%s %d %d %d %d %f\n", 
            s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
    
    
        
    
       
    }
    
    
    

}

    

   