package bitcamp.java100;

import java.util.Scanner;

public class Testme3{
    
    
   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

   String[] sts1 = new String[2];
   int[] sts = new int[2];
   int a;
   int b;
   int c;

   sts[0] = sc.nextInt();
   sts[1] = sc.nextInt();
   sts1[0] = sc.next();
   sts1[1] = sc.next();
   
  
    System.out.println(sts[0]+" "+sts1[0]);   

    System.out.println("0. "+sts1[0]+"1. "+sts1[1]);
    c= sc.nextInt();
    b = sts[c];
    System.out.println("얼마를 출금 하시겠습니까");
    a = sc.nextInt();
    b = b-a;
    sts[c] = b;
    System.out.println(sts1[c]+"님 "+b+"원 남으셨습니다.");

   
}
}