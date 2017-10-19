package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;
//연습문제 2 : 거꾸로 출력!

// 이름, 이메일, 전화번호를 입력받는다.
// 저장하시겠습니까?(y/n)
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n)
public class Test21_9{
    
    static class Mamber {
        
        String name;
        String email;
        String number;
        public Mamber(String name, String email, String number) {
            this.name = name;
            this.email = email;
            this.number = number;
            
        }
        
    }
    
    static void coumpute(Mamber[] mam) {
        Console console = System.console();
        for(int i=0; i < mam.length; i++) {
            mam[i] = new Mamber(console.readLine("이름:"), console.readLine("Email:"), console.readLine("전화번호:"));
        
        String s1 = console.readLine("저장하시겠습니까? (y/n)");
        String s2 = console.readLine("계속입력 하시겠습니까?(y/n)");
        if(s1.equals("n")) {
         mam[i].name = "저장안됨";
         mam[i].email = "저장안됨";
         mam[i].number = "저장안됨";
        }else if(s2.equals("n")) {
            for(int k=0; k <= i; k++) { 
            
                System.out.println(mam[k].name+"   "+mam[k].email+"  "+mam[k].number);
                //throw new NullPointerException("빈값 입니다.");
            }
           
            System.exit(1) ;
        }
       
        }
    }
    
    static void print(Mamber[] mam) {
        for(int j=0; j < mam.length; j++) {
            System.out.println(mam[j].name+"   "+mam[j].email+"  "+mam[j].number);
             }
    }
    
    
    
    public static void main(String[] args) throws Exception {
    
        
        System.out.println("------------- 고객 리스트 프로그램 입니다 명단을 작성해 주세요! ---------------");
        Mamber[] mam = new Mamber[999999];
        
        coumpute(mam);
        print(mam); 
        
    }
    }
    
  
  
  
  

        

   


   