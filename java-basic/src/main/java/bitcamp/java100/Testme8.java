package bitcamp.java100;

import java.util.Scanner;

import bitcamp.java100.Testme4.Student;

public class Testme8{
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name = "jns";
        int mony = 1500;

        Student[] st = new Student[3];
        System.out.println("이름과 값을 입력하시오");
        st[0] = new Student(sc.next(), sc.nextInt());
        System.out.println("이름과 값을 입력하시오");
        st[1] = new Student(sc.next(), sc.nextInt());
        System.out.println("이름과 값을 입력하시오");
        st[2] = new Student(sc.next(), sc.nextInt());
        

        System.out.println("조회를 원하시는 회원번호를 입력하시오");
        System.out.println("0. "+st[0].name+"1. "+st[1].name+"2. "+st[2].name);
        System.out.println(st[sc.nextInt()].money);

    
    
        
        

    }
}