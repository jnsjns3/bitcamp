package bitcamp.java100;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import bitcamp.java100.Testme4.Student;
import bitcamp.java100.Testme9_1.Studenta;

public class Testme8{
    static PrintWriter pr;
    public static Studenta[] st = new Studenta[3];
    static FileReader filereader;
    static File file;
    public static void main(String[] args) throws Exception {
        st[0] = new Studenta(); 
        st[1] = new Studenta(); 
        
        int cho;
        int ah;
        Integer in = 0;
        
       Scanner sc = new Scanner(System.in);
       
       System.out.println("메뉴를 선택하시오!");
       System.out.println("1.가입    2.조회");
       
       cho = sc.nextInt();
       
       switch (cho) {
    case 1: 
        st[0].name = sc.next();
        st[0].su = sc.nextInt();
        st[1].name = sc.next();
        st[1].su = sc.nextInt();
        
        try {
            pr = new PrintWriter("C:\\Users\\bit-user\\Desktop\\new\\out.txt");
            
            pr.print(st[0].name);
            pr.print(st[0].su);
            pr.println();
            pr.print(st[1].name);
            pr.print(st[1].su);
            pr.close();
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("에러");
        } 
      
        break;
        
    case 2: 
        String name;
        
        try {
            file = new File("C:\\Users\\bit-user\\Desktop\\new\\out.txt");
            filereader = new FileReader(file);
            BufferedReader reader = new BufferedReader(filereader);
            String line = null;
            
            
            while((line = reader.readLine()) != null) {
                if(line.contains("Minsu")) {
                    System.out.println(line);
                  
                }
                ah = Integer.parseInt(line);
              System.out.println(ah);
            }
            reader.close();
            
        } catch (Exception ex) {
            // TODO Auto-generated catch block
            System.out.println("오류!");
        }
        System.out.println("조회 되었습니다!");
        
            
            
        
        
         break;
        
       

    default:
        break;
    }
       
    
        main(args);
        

    }
}