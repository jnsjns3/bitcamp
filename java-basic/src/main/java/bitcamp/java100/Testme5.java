package bitcamp.java100;

import java.util.Scanner;

import bitcamp.java100.Testme4.Student;

public class Testme5{

    public static void ong() {
    
    int a;
    Scanner sc = new Scanner(System.in);
    
    
    Student[] st = new Student[2];

    st[0] = new Student("Minsu", 15000);
    st[1] = new Student("Su", 13000);
    
    for(int i=0; i<st.length; i++){
        
    }
    st[0].money = st[0].money-500;
    
    a = st[0].money;
    System.out.println(a);
   
    
}


}
