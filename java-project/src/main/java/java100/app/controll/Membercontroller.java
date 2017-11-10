package java100.app.controll;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Member;
import java100.app.util.Prompts;

public class Membercontroller extends GenericController<Member> {
    
    private String dataFilePath;
    
    
    
    public Membercontroller(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    @Override
    public void destroy() {
        
        
        try (FileWriter out = new FileWriter(this.dataFilePath);){
            
            
            for(Member member : this.list) {
                out.write(member.toCSVString() + "\n");
            }
            
           
        } catch (IOException e) {
            e.printStackTrace();
        
        }
        
    }
    @Override
    public void init() {
        try(FileReader in = new FileReader(this.dataFilePath);
            Scanner sc = new Scanner(in);    
                ) {
            
            String csv = null;
            while(sc.hasNextLine()) {
              csv = sc.nextLine();  
             
                try {
                    list.add(new Member(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            
            
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
}
    
    
    @Override
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
            Member member = iterator.next();
            System.out.printf("%s, %s\n", member.getName(), member.getPassword());
        }
    }
    
    private void doAdd() {
        System.out.println("[회원 등록]");
        Member member = new Member();
       
       
        member.setEmail(Prompts.inputString("이메일?"));
        if(findByEmail(member.getEmail()) != null) {
            System.out.println("이미 등록된 이메일 입니다.");
            return;
        }
        
        member.setName(Prompts.inputString("이름?"));
        member.setPassword(Prompts.inputString("암호?"));
        list.add(member);
            
            
          
   }
    private void doView() {
        
        System.out.println("[회원 상세 정보]");
        String email = Prompts.inputString("이메일?");
        Member member = findByEmail(email);
       
        if(member == null) {
            System.out.printf("%s 의 성적 정보가 없습니다.\n", email);
        }
            System.out.printf("이름: %s\n ", member.getName());
            System.out.printf("email: %s\n ", member.getEmail());
            System.out.printf("암호: %s\n " , member.getPassword());
            
   }
    
    private void doUpdate() {
        System.out.println("[회원 정보 변경]");
        String email = Prompts.inputString("이메일? ");
        Member member = findByEmail(email);
       
        if(member == null) {
            System.out.printf("%s 의 회원 정보가 없습니다.\n", email);
        }else {
           
            
            
            String name = Prompts.inputString("이름? (%s) ",member.getName());
            if(name.isEmpty()) {
                name = member.getName();
            }
            
            String password = Prompts.inputString("암호? (%s) ", member.getPassword());
            if(password.isEmpty()) {
                password = member.getPassword();
            }
           
            if(Prompts.confirm2("변경 하시겠습니까?(y/N) ")) {
                member.setName(name);
                member.setPassword(password);
                
                System.out.println("변경 하였습니다!");
                
            }else{
                System.out.println("변경을 취소하였습니다.");
            }
            
        }
       
   }
    private void doDelete() {
        System.out.println("[회원 삭제]");
        String email = Prompts.inputString("이메일? ");
        
        Member member = findByEmail(email);
        
        if(member == null) {
            System.out.printf("%s 의 성적 정보가 없습니다.\n", email);
           return;
        }
            if(Prompts.confirm2("정말 삭제 하시겠습니까?(y/n)")) {
                list.remove(member);
            }else {
                System.out.println("삭제를 취소하였습니다.");
            }
           
        }
        
        
   
    
    private Member findByEmail(String email) {
        Iterator<Member> iterator;
        
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            if(member.getEmail().equals(email)) {
                return member;
            }
        }
        return null;
    }
    
}
