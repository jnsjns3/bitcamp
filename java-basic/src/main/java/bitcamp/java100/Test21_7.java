package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;
//연습문제 2 : 거꾸로 출력!

// 이름, 이메일, 전화번호를 입력받는다.
// 저장하시겠습니까?(y/n)
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n)
public class Test21_7{
    
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
    
    public static void main(String[] args) throws Exception {
    
        
        
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        
        
        Mamber[] mam = new Mamber[3];
        
        for(int i=0; i < mam.length; i++) {
            mam[i] = new Mamber(console.readLine("이름:"), console.readLine("Email:"), console.readLine("전화번호:"));
        
        String s1 = console.readLine("저장하시겠습니까? (y/n)");
        if(s1.equals("n")) {
         mam[i].name = "저장안됨";
         mam[i].email = "저장안됨";
         mam[i].number = "저장안됨";
        }
        
        String s2 = console.readLine("계속입력 하시겠습니까?(y/n)");
        if(s2.equals("n")) {
            System.exit(1);
        }
       
        
        
        
        }
        
        System.out.println(mam[0].name+"   "+mam[0].email+"  "+mam[0].number);
        System.out.println(mam[1].name+"   "+mam[1].email+"  "+mam[1].number);
        System.out.println(mam[2].name+"   "+mam[2].email+"  "+mam[2].number);
               
            
        
    
        
        
            
    
    }
    }
    
  
  
  
  

        

   


   