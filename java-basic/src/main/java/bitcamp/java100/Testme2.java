package bitcamp.java100;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

// Bank System 업그레이드!
public class Testme2{
    

    static class Member{
       
        String name;
        int money;
            
    }
    
    static void cal(String name, Member[] mem, int plus) {
        
        for(int i=0; i<mem.length; i++) {
            if(mem[i].name.equals(name)) {
                mem[i].money += plus;
                System.out.println(mem[i].name +" 님 " + plus + "원 입금되셨습니다!");
            }
        }
    }
    
    static void cal2(String name, Member[] mem, int miner) {
        
        for(int i=0; i<mem.length; i++) {
            if(mem[i].name.equals(name)) {
                mem[i].money -= miner;
                System.out.println(mem[i].name +" 님 " + miner + "원 출금 되셨습니다!");
            }
        }
    }
    
   public static void main(String[] args){

       Member[] mem = new Member[2];
       Scanner sc = new Scanner(System.in);
       int cho;
       boolean bol = true;
       for(int i=0; i<mem.length; i++) {
           mem[i] = new Member();
       }

       while(bol == true) {
           
           System.out.println("메뉴를 선택하시오 0. 회원가입 1. 입금  2. 탈출  3. 출금  4. 전체조회");
           cho = sc.nextInt();
           switch (cho) {
        case 0:
            for(int i=0; i<mem.length; i++) {
                System.out.println("이름을 입력하세요");
                mem[i].name = sc.next();
                System.out.println("입금할 금액을 입력하세요");
                mem[i].money = sc.nextInt();
                
            }   
            break;
        case 1:
            System.out.println("입금하실 회원이름은?");
            String name = sc.next();
            System.out.println("얼마나 입금하시겠습니까?");
            int plus = sc.nextInt();
            
            
            cal(name, mem, plus);
            break;
            
        case 3:
            System.out.println("출금하실 회원이름은?");
            String name1 = sc.next();
            System.out.println("얼마나 입금하시겠습니까?");
            int miner = sc.nextInt();
            
            cal2(name1, mem, miner);
            break;
        case 4: 
            for(int i=0; i<mem.length; i++) {
                System.out.println(mem[i].name+"님 금액 : "+mem[i].money);
            }
            break;
        case 2: bol = false;
        break;
        default:
            break;
        }
           
       }
       
}
}