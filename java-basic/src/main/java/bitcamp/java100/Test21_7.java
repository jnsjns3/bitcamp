package bitcamp.java100;

import java.io.Console;
import java.util.Scanner;
//연습문제 2 : 거꾸로 출력!

import javax.swing.plaf.metal.OceanTheme;

// 이름, 이메일, 전화번호를 입력받는다.
// 저장하시겠습니까?(y/n)
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n)
public class Test21_7{
    
    static class Contact{
        String name;
        String eamil;
        String tel;
        
        
        
    }
    public static void main(String[] args) {
    
        
        Console console = System.console();
        
        Contact[] contatcts = new Contact[100];
        
        
        int cursor = 0;
        while(cursor < contatcts.length) {
            Contact contact = new Contact();
            
            contact.name = console.readLine("이름?");
            contact.eamil = console.readLine("이메일?");
            contact.tel = console.readLine("전화번호?");
            
            String response = console.readLine("저장하시겠습니까?");
            if(response.toLowerCase().equals("y") || 
               response.toLowerCase().equals("yes")) {
               //이름 이메일 전화 데이터가 저장된 인스턴스 주소를 배열에 저장
                contatcts[cursor] = contact;
            
               cursor++;    
                    }
           
            response = console.readLine("계속 입력하시겠습니까? (y/n)");
            
            if(!(response.toLowerCase().equals("y") || 
                response.toLowerCase().equals("yes"))) {
                break;
            }
            
        }
        
       for(int i=0; i < cursor; i++) {
            System.out.printf("%s, %s, %s\n",contatcts[i].name,
                                             contatcts[i].eamil,
                                             contatcts[i].tel);
            
       
        }
       
    
        
        
            
    
    }
    }
    
  
  
  
  

        

   


   