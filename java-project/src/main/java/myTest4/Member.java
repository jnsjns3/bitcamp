package myTest4;

import java.util.Scanner;

public class Member {

    protected String name;
    protected String email;
    protected String password;
    
    public Member() {
        
    }
    public Member(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        
    }
    
    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", password=" + password + "]";
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void print() {
        System.out.printf("%s, %s\n", this.name, this.password);
        
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름?");
        this.name = sc.nextLine();
        
        System.out.println("이메일?");
        this.email = sc.nextLine();
        System.out.println("암호?");
        this.password = sc.nextLine();
        System.out.println();
      
        
    }
    
    public void printDetail() {
        
        System.out.println("이름: " +this.name);
        System.out.println("email: " +this.email);
        System.out.println("암호: " +this.password);
        
                
    
}
    public void update() {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("이름? (%s) ",this.name);
        String name = sc.nextLine();
        if(name.isEmpty()) {
            name = this.name;
        }
        System.out.printf("암호? (%s) ",this.password);
        String passowrd = sc.nextLine();
        if(passowrd.isEmpty()) {
            passowrd = this.password;
        }
       
        if(Prompts.confirm2("변경 하시겠습니까?(y/N) ")) {
            this.name = name;
            this.password = passowrd;
            
            System.out.println("변경 하였습니다!");
            
        }else{
            System.out.println("변경을 취소하였습니다.");
        }
        
        
    }
    
}
