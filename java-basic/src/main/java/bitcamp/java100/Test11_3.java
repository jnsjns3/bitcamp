package bitcamp.java100;

public class Test11_3{

   public static void main(String[] args){

   System.out.print("ABC");
   System.out.print('\b'); //Backspace 커서를 뒤로 한 칸 이동
   
   System.out.println("123");


   System.out.println("ABC\t123"); //5칸 이동
   
   System.out.println("ABC\n123"); //커서를 다음 줄로 이동한다
   System.out.println("ABC\r123"); //Carrage Return(CR; 0x000d)
   System.out.println("ABC'f123");
   System.out.println('\'');
   System.out.println("c:\\workspace\\test");
   
   
}
}