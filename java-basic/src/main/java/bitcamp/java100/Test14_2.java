package bitcamp.java100;
public class Test14_2{
 
    // 도서명, 저자, 출판사, 페이지, 가격
    
   public static void main(String[] args){
 
   
    
    class Bk{

    String book;
    String name;
    String chul;
    int page;
    int price;
    }

    Bk bb = new Bk();

    bb.book = "도서명: 스티브";
    bb.name = "저자: 홍길동";
    bb.chul = "출판사: 성원";
    bb.page = 500;
    bb.price = 7000;


    System.out.printf("%s\n %s\n %s\n %d쪽\n %d원\n"
        ,bb.book, bb.name, bb.chul, bb.page, bb.price);
    
    
   }
}


// 사용자 정의 데이터 타입
    

   