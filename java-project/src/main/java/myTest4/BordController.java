package myTest4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class BordController {
    
    static Scanner sc = new Scanner(System.in);
    private ArrayList<Bord> list = new ArrayList<>();
    
    public void excute() {
        loop:
            while(true) {
           System.out.println("게시판> ");
           
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
            //break loop;
              
        default:
            System.out.println("해당 명령이 없습니다"); break;
            
        }
            }
    
    }
    private void doList(){
        System.out.println("[게시판 목록]");
        Iterator<Bord> iterator;
        iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
    }
    
    private void doAdd() {
        System.out.println("[게시판 등록]");
        Bord bord;
        
        bord = new Bord();
        bord.input();
      boolean isExist = false;
      Iterator<Bord> iterator = list.iterator();
      while(iterator.hasNext()) {
                
      if(iterator.next().no.equals(bord.no)) {
         isExist = true;
          break;
                }
            }
            if(isExist) {
                System.out.println("이미 등록된 번호 입니다.");
            }else {
                list.add(bord);
            }
            
          
   }
    
    private void doView() {
        
        System.out.println("[게시판 상세 정보]");
        String no = Prompts.input("번호? ");
        Bord bord = null;
       Iterator<Bord> iterator;
       
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Bord temp = iterator.next();
            if(temp.no.equals(no)) {
                bord = temp;
                break;
            }
        }
        if(bord == null) {
            System.out.printf("%s 의 게시판 정보가 없습니다.\n", no);
        }else {
            bord.printDetail();
        }
       
   }
    
   
    private void doUpdate() {
        System.out.println("[게시판 정보 변경]");
        String no = Prompts.input("번호? ");
        Bord bord = null;
       Iterator<Bord> iterator;
       
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Bord temp = iterator.next();
            if(temp.no.equals(no)) {
                bord = temp;
                break;
            }
        }
        if(bord == null) {
            System.out.printf("%s 의 게시판 정보가 없습니다.\n", no);
        }else {
           
            bord.update();
            
        }
       
   }
    
    private void doDelete() {
        System.out.println("[게시판 삭제]");
        String no = Prompts.input("번호? ");
        
        Bord bord = null;
        Iterator<Bord> iterator;
        
         iterator = list.iterator();
         while(iterator.hasNext()) {
             Bord temp = iterator.next();
             if(temp.no.equals(no)) {
                 bord = temp;
                 break;
             }
         }
        if(bord == null) {
            System.out.printf("%s 의 성적 정보가 없습니다.\n", no);
        }else {
            if(Prompts.confirm2("정말 삭제 하시겠습니까?")) {
                list.remove(bord);
            }else {
                System.out.println("삭제를 취소하였습니다.");
            }
           
        }
        
        
       
   }
    
}
