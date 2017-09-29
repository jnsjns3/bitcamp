package bitcamp.java100;
public class Test13_3{
    
    
   public static void main(String[] args){

      int[] arr1;

      arr1 = new int[3];

      System.out.println(arr1.length);
      // 레퍼런스 변수를 통해 사용하는 내부 변수를 "프로퍼티(property)"라 부른다.
      
      arr1[0] = 100;
      arr1[1] = 90;
      arr1[2] = 80;
      
      //java.lang.ArrayIndexOutOfBoundsExcption 예외 오류 발생
      //arr1[-1] = 200;
      //arr1[3] = 100;
      //[?]괄호안에 있는 번호가 Index

}
}

    

   