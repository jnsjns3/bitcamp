package bitcamp.java100;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.util.Scanner;

public class app{
    static Scanner read; 
    static PrintWriter pr;
    
    public static void main(String[] args) {
        String str = "Hello world!!";
      
        try {
            read = new Scanner(new File("C:\\Users\\bit-user\\Desktop\\new\\out.txt"));
           
            String st = read.nextLine();
        
        
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("에러");
        }
        
        
    }
}