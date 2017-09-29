package bitcamp.java100;


public class Test14_3{
 
    // 수강생정보
    // 이름 나이 주소 
    
   public static void main(String[] args){
 
    class Sugang{

    String name;
    int age;
    String adress;
    String book;
    float sco;

    }
    Sugang su = new Sugang();

    su.name = "이름 : Jang";
    su.age =30;
    su.adress = "주소 : 경기도 의왕시";
    su.book = "과목 : Java Programing 과정";
    su.sco = 4.2f;

    System.out.println(su.name);
    System.out.println(su.age+"살");
    System.out.println(su.adress);
    System.out.println(su.book);
    System.out.println("학점 : "+su.sco);
    
    
    
    
}
}


// 사용자 정의 데이터 타입
    

   