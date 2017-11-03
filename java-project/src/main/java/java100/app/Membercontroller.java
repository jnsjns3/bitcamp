package java100.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Membercontroller {
    
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Member> list = new ArrayList<>();
    
    public void excute() {
        loop:
            while(true) {
           System.out.println("회원관리> ");
           
           String input = sc.nextLine();
          
           switch (input) {
        case "add":
            this.doAdd(); break;
            
        case "list":
            this.doList(); break;
            
        case "view":
            this.doView(); break;
            
        case "update":
            this.doUpdate(); break; 
            
        case "delete":
            this.doDelete(); break;
            
        case "main":
            break loop;
              
        default:
            System.out.println("해당 명령이 없습니다"); break;
            
        }
            }
    
    }
    private void doList(){
        System.out.println("[회원 목록]");
        Iterator<Member> iterator;
        iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
    }
    
    private void doAdd() {
        System.out.println("[회원 등록]");
        Member member;
        
      member = new Member();
      member.input();
      boolean isExist = false;
      Iterator<Member> iterator = list.iterator();
      while(iterator.hasNext()) {
                
      if(iterator.next().email.equals(member.email)) {
         isExist = true;
          break;
                }
            }
            if(isExist) {
                System.out.println("이미 등록된 이메일 입니다.");
            }else {
                list.add(member);
            }
            
          
   }
    private void doView() {
        
        System.out.println("[회원 상세 정보]");
        String email = Prompts.input("이메일? ");
        Member member = null;
       Iterator<Member> iterator;
       
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Member temp = iterator.next();
            if(temp.email.equals(email)) {
                member = temp;
                break;
            }
        }
        if(member == null) {
            System.out.printf("%s 의 성적 정보가 없습니다.\n", email);
        }else {
            member.printDetail();
        }
       
   }
    private void doUpdate() {
        System.out.println("[회원 정보 변경]");
        String email = Prompts.input("이메일? ");
        Member member = null;
       Iterator<Member> iterator;
       
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Member temp = iterator.next();
            if(temp.email.equals(email)) {
                member = temp;
                break;
            }
        }
        if(member == null) {
            System.out.printf("%s 의 회원 정보가 없습니다.\n", email);
        }else {
           
            member.update();
            
        }
       
   }
    private void doDelete() {
        System.out.println("[회원 삭제]");
        String email = Prompts.input("이메일? ");
        
        Member member = null;
        Iterator<Member> iterator;
        
         iterator = list.iterator();
         while(iterator.hasNext()) {
             Member temp = iterator.next();
             if(temp.email.equals(email)) {
                 member = temp;
                 break;
             }
         }
        if(member == null) {
            System.out.printf("%s 의 성적 정보가 없습니다.\n", email);
        }else {
            if(Prompts.confirm2("정말 삭제 하시겠습니까?")) {
                list.remove(member);
            }else {
                System.out.println("삭제를 취소하였습니다.");
            }
           
        }
        
        
       
   }
    
}
