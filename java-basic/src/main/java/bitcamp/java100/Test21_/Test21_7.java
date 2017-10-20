package bitcamp.java100.Test21_;

import java.io.Console;

import bitcamp.java100.Test21_.Test21_Contact.Contact;


// 이름, 이메일, 전화번호를 입력받는다.
// 저장하시겠습니까?(y/n)
// 저장하였습니다.
// 계속입력하시겠습니까?(y/n)

public class Test21_7{
   
     
    
    
    static int cursor = 0;
    public static Console console = System.console();
    

 
    public static void printContacts(){
        for(int i=0; i < ContactArray.size(); i++) {
           Contact contact = ContactArray.get(i);
           
            System.out.printf("%s, %s, %s\n",contact.name,
                                             contact.eamil,
                                             contact.tel);
        }
        
    }
    
    public static boolean confirm(String message ) {
        String input = console.readLine(message + "(y/n)");
        
        if(input.toLowerCase().equals("y") || 
           input.toLowerCase().equals("yes")) 
            
            
        
        return true;
        return false;
    }
public static Contact inputContact() {
        
        Contact contact = new Contact();
        
        contact.name = console.readLine("이름?");
        contact.eamil = console.readLine("이메일?");
        contact.tel = console.readLine("전화번호?");
        
        return contact;
    }
    
    
    
    public static void main(String[] args) {
    
        console = System.console();
         
        while(true) {
            Contact contact = inputContact();
            
            if(confirm("저장하시겠습니까?")) {
               //이름 이메일 전화 데이터가 저장된 인스턴스 주소를 배열에 저장
                try {
                ContactArray.add(contact);
                }catch (RuntimeException e) {
                   System.err.println("최대 저장 개수를 초과하였습니다.");
                   break;
                }
                    }
            
           if(!confirm("계속 입력하시겠습니까?")) {
               break;
           }
        }
        
       printContacts();
    
        
        
            
    
    }
    }
    
  
  
  
  

        

   


   