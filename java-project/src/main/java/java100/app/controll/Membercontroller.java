package java100.app.controll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

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
        
        
        try (PrintWriter out = new PrintWriter
                (new BufferedWriter
                        (new FileWriter(this.dataFilePath)));){
            
            
            for(Member member : this.list) {
                out.println(member.toCSVString());
            }
            out.flush();
           
        } catch (IOException e) {
            e.printStackTrace();
        
        }
        
    }
    @Override
    public void init() {
        try(BufferedReader in = new BufferedReader(
                new FileReader(this.dataFilePath));
                ) {
            
            String csv = null;
            while((csv=in.readLine()) != null) {
              
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
    public void excute(Request request, Response response) {
        
         
     
          
           switch (request.getMenuPaht()) {
        case "/member/add":
            this.doAdd(request, response); break;
            
        case "/member/list":
            this.doList(request, response); break;
            
        case "/member/view":
            this.doView(request, response); break;
            
        case "/member/update":
            this.doUpdate(request, response); break; 
            
        case "/member/delete":
            this.doDelete(request, response); break;
       
              
        default:
            response.getWriter().println("해당 명령이 없습니다"); break;
            
        }
            
    
    }
     
    private void doList(Request request, Response response){
        PrintWriter out = response.getWriter();
        
        out.println("[회원 목록]");
        Iterator<Member> iterator;
        iterator = list.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();
            out.println(member.getEmail()+" "+member.getName());
           
            
        }
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[회원 등록]");
        Member member = new Member();
       
        member.setEmail(request.getParameter("emaile"));
        if(findByEmail(member.getEmail()) != null) {
            out.println("이미 등록된 이메일 입니다.");
            return;
        }
        
        member.setName(request.getParameter("name"));
        member.setPassword(request.getParameter("password"));
        list.add(member);
        out.println("저장되었습니다.");
            
          
   }
    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[회원 상세 정보]");
        String emaile = request.getParameter("emaile");
        Member member = findByEmail(emaile);
       
        if(member == null) {
            out.printf("%s 의 정보가 없습니다.\n", emaile);
        }
            out.println(member.getName());
            out.println(member.getEmail());
            out.println(member.getPassword());
            
   }
    
    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[회원 정보 변경]");
        String emaile = request.getParameter("emaile");
        Member member = findByEmail(emaile);
       
        if(member == null) {
            out.printf("%s 의 회원 정보가 없습니다.\n", emaile);
        }else {
           
            member.setEmail(request.getParameter("emaile"));
            member.setName(request.getParameter("name"));
            member.setPassword(request.getParameter("password"));
            
            out.println("변경하였습니다.");
        }
       
   }
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        String emaile = request.getParameter("emaile");
        
        Member member = findByEmail(emaile);
        
        if(member == null) {
            out.printf("%s 의 성적 정보가 없습니다.\n", emaile);
           return;
        }
          list.remove(member);
          out.println("삭제되었습니다.");  
           
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
