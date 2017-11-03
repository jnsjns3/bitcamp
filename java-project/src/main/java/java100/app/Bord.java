package java100.app;

import java.sql.Date;
import java.util.Scanner;

public class Bord {

    protected int no;
    protected String title;
    protected String content;
    protected Date regDate;
    protected int viewCount;
    
    
    public Bord() {
        // TODO Auto-generated constructor stub
    }


    @Override
    public String toString() {
        return "Bord [no=" + no + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", viewCount="
                + viewCount + "]";
    }


    public int getNo() {
        return no;
    }


    public void setNo(int no) {
        this.no = no;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public Date getRegDate() {
        return regDate;
    }


    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }


    public int getViewCount() {
        return viewCount;
    }


    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
    
    public void print() {
        
        System.out.printf("%d, %s, %s, %d\n", this.no, this.title, this.regDate.toString(), this.viewCount);
        
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("번호?");
        this.no = Integer.parseInt(sc.nextLine());
        
        System.out.println("제목?");
        this.title = sc.nextLine();
        System.out.println("내용?");
        this.content = sc.nextLine();
        System.out.println();
        this.regDate = new Date(System.currentTimeMillis()); // 최근 시간 입력
      
        
    }
    
    public void printDetail() {
        
        
        System.out.printf("제목: %s\n", this.title);
        System.out.printf("내용: %s\n", this.content);
        System.out.printf("등록일: %s\n", this.regDate.toString());
        System.out.printf("조회수: %d\n", ++this.viewCount);
                
}
    
    
    public void update() {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("제목? (%s) ",this.title);
        String title = sc.nextLine();
        if(title.isEmpty()) {
            title = this.title;
        }
        System.out.printf("내용? (%s) ",this.content);
        String passowrd = sc.nextLine();
        
       
        if(Prompts.confirm2("변경 하시겠습니까?(y/N) ")) {
            this.title = title;
            this.content = content;
            this.regDate = new Date(System.currentTimeMillis());
            System.out.println("변경 하였습니다!");
            
        }else{
            System.out.println("변경을 취소하였습니다.");
        }
        
        
    }
    
}
