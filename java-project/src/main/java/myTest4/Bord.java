package myTest4;

import java.util.Date;
import java.util.Scanner;
//요구사항
/*
게시판> add
번호? 1
제목? aaa
내용? aaaa
날짜

입력하였습니다.

회원관리> add
번호? 1
이미 등록된 번호입니다.

성적관리> list
1, aaa, 2017-11-3, 0(조회수)
2, bbb, 2017-11-3, 2

성적관리> view
번호? 1
제목: aaa
내용: aaaa
등록일: 2017-11-3
조회수: 1
9번 게시물이 없습니다.
*/

public class Bord {

    protected String no;
    protected String name;
    protected String page;
    protected Date date;
    int len;
    
    public Bord() {
        
    }
    public Bord(String no, String name, String page) {
        this.no = no;
        this.name = name;
        this.page = page;
        
    }
    
    
    @Override
    public String toString() {
        return "Bord [no=" + no + ", name=" + name + ", page=" + page + ", date=" + date + "]";
    }
    
    
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void print() {
        len++;
        
        System.out.printf("%s, %s, %s, %d\n", this.no, this.name, this.page, this.len);
        
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("번호?");
        this.no = sc.nextLine();
        
        System.out.println("이름?");
        this.name = sc.nextLine();
        System.out.println("내용?");
        this.page = sc.nextLine();
        System.out.println();
      
        
    }
    
    public void printDetail() {
        
        len++;
        System.out.println("번호: " +this.no);
        System.out.println("이름: " +this.name);
        System.out.println("내용: " +this.page);
        System.out.println("조회수: " +this.len);
        
                
    
}
    public void update() {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("이름? (%s) ",this.name);
        String name = sc.nextLine();
        if(name.isEmpty()) {
            name = this.name;
        }
        System.out.printf("내용? (%s) ",this.page);
        String page = sc.nextLine();
        if(page.isEmpty()) {
            page = this.page;
        }
       
        if(Prompts.confirm2("변경 하시겠습니까?(y/N) ")) {
            this.name = name;
            this.page = page;
            
            System.out.println("변경 하였습니다!");
            
        }else{
            System.out.println("변경을 취소하였습니다.");
        }
        
        
    }
    
}
