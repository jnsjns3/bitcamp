package bitcamp.java100.TestmeSi.Testme3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class fileTest {

    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    
    
    @Override
    public String toString() {
        return "fileTest [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum
                + ", aver=" + aver + "]";
    }



    public static void main(String[] args) {
        ArrayList<fileTest> list = new ArrayList<>();
        fileTest ft = new fileTest();
        
        try(FileWriter wri = new FileWriter("./data/testme.csv")){
            String str2 = null;
            str2 = str2.format("%s,%d,%d,%d,%d,%f",
                    ft.name,
                    ft.kor,
                    ft.eng,
                    ft.math,
                    ft.sum,
                    ft.aver);
            wri.write(str2);
            
        } catch (IOException e1) {
            System.out.println("쓰기 오류입니다.");
        }
        
        
        
        
        
        
        
        
        try(FileReader file = new FileReader("./data/testme.csv");
            Scanner sc = new Scanner(file);
                ) {
           
           while(sc.hasNext()) {
               String str = sc.nextLine();
               String[] sta = str.split(",");
               ft.name = sta[0];
               ft.kor = Integer.parseInt(sta[1]);
               ft.eng = Integer.parseInt(sta[2]);
               ft.math = Integer.parseInt(sta[3]);
               ft.sum = Integer.parseInt(sta[4]);
               ft.aver = Integer.parseInt(sta[5]);
               System.out.println(ft.toString());
               list.add(ft);
               list.clear();
           }
           
        } catch (Exception e) {
            System.out.println("읽기오류 발생!");
        }
     
        
    }
    
}
