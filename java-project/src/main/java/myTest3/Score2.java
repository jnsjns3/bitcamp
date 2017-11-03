package myTest3;
import java.util.Scanner;

//: ## 생성자와 인스턴스 메서드 도입
//: - init() 메서드 대신 생성자를 이용하여 인스턴스를 초기화시킨다.
//: - print() 메서드는 인스턴스 데이터를 다루기 때문에 스태틱 메서드 대신
//:   인스턴스 메서드로 전환한다. 
//: 캡슐화 문법을 적용하라!
//: setter / getter의 정의와 사용을 연습한다!

public class Score2 {
    
    protected String name;
    protected String email;
    protected String password;
    
    
    
    //: ### 생성자 
    // public으로 공개한다. 다른 패키지에서도 호출할수 있도록 변경!
    public Score2(){
       
    }
    
    
    public Score2(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        
    }
    
     
    
    //전체공개할 메서드는 public으로 공개한다.
    public void print() {
        System.out.printf("%-4s, %4s, %4s\n",  
                this.name, 
                this.email,
                this.password);
    }
    public void printDetail() {
        
        System.out.printf("%-4s, %4s, %4s\n",  
                this.name, 
                this.email,
                this.password);
        
        
    }
    static boolean confirm2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String response = sc.nextLine().toLowerCase();
        
        if(response.equals("n") || response.equals("no") || response.equals("") ) {
            return false;
        }
            return true;
        
    }
    public void input(String name, String email, String password) {
        Scanner sc = new Scanner(System.in);
        
        this.name = name;
        
        this.email = email;
       
        this.password = password;
        
        
    }
    
    public void update() {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("이름 (%s) ",this.name);
        String name = this.name;
        try {
            name = sc.nextLine();
        }catch (Exception e) {
        }
        
        System.out.printf("이메일? (%s) ",this.email);
        String emaile = this.email;
        try {
            emaile = sc.nextLine(); 
        }catch (Exception e) {
        }
        System.out.printf("암호? (%s) ",this.password);
        String passowrd = this.password;
        try {
            passowrd = this.password; 
        }catch (Exception e) {
        }
        
        if(confirm2("변경 하시겠습니까?(y/N) ")) {
            this.name = name;
            this.email = emaile;
            this.password = passowrd;
            
            System.out.println("변경 하였습니다!");
            
        }else{
            System.out.println("변경을 취소하였습니다.");
        }
        
       
    }
     
    
}
