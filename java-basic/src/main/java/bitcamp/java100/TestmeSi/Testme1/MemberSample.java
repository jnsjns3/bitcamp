package bitcamp.java100.TestmeSi.Testme1;
import java.util.Scanner;

public class MemberSample extends Controll {
    
    protected String name;
    protected String title;
    protected String content;
    


    public MemberSample(){
       
    }
    
    
    public MemberSample(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }
    
    
    
    //전체공개할 메서드는 public으로 공개한다.
    public void print() {
        System.out.printf("%-4s, %4s, %4s\n",  
                this.name, 
                this.title,
                this.content);
    }
    public void printa(String nA) {
         if(nA.equals(this.name)) {
             System.out.printf("%-4s, %4s, %4s\n",  
                     this.name, 
                     this.title,
                     this.content);
         }
        
    }
    public void suJung(String nA) {
        Scanner sc = new Scanner(System.in);
        if(nA.equals(this.name)) {
            MemberSample aa = new MemberSample();
            System.out.println("이름?");
            aa.name = sc.nextLine();
            
            System.out.println("제목? ");
            aa.title = sc.nextLine();
            
            System.out.println("내용? ");
            aa.content = sc.nextLine();
            
            System.out.println("변경하시겠습니까?(y/n)");
            String check = sc.next();
            if(check.equals("y")) {
                this.name = aa.name;
                this.title = aa.title;
                this.content = aa.content;
                
                
            }else {
                aa = null;
            }
            
        }
       
   }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름?");
        this.name = sc.nextLine();
        
        System.out.println("제목? ");
        this.title = sc.nextLine();;
        System.out.println("내용? ");
        this.content = sc.nextLine();
        
        
    }
}
