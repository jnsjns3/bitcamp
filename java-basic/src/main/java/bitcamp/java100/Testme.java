package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;

public class Testme{

    static class Member{
        String name;
        String emaile;
        String num;
        
    }
    
   public static void main(String[] args){
    
    Console console = System.console();
    Member[] mem = new Member[3];
    int i =0;
    
    while(i < mem.length) {
        Member memr = new Member();
        memr.name = console.readLine("이름?");
        memr.emaile = console.readLine("이메일?");
        memr.num = console.readLine("전화번호?");
        
        String s1 = console.readLine("저장하시겠습니까? (y/n)");
        if(s1.equals("y")) {
            mem[i] = memr;    
            i++;
        }
        
        s1 = console.readLine("계속 입력 하시겠습니까? (y/n)");
        if(s1.equals("n")) {
            break;
        }
        
    }
    
    
    for(int j=0; j < i; j++) {
        System.out.println(mem[j].name +" "+ mem[j].emaile +" "+ mem[j].num);
    }
    
    
}
}