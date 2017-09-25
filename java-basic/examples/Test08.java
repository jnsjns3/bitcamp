public class Test08 {
    
      /**
       이 변수는 출력하려는 문자열을 저장하고 있다.
       */
      static String message = "Hello!";
    
      /** 프로그램을 시작할 때 제일 먼저 시작되는 명령어 블록이다.
          <b>"프로그램 엔트리(entry)"</b>라 부른다.
      */
      public static void main(String[] ags) {
        /* 표준 출력 장치(모니터)로 문자열을 출력하려면,
           다음 명령을 작성해야 한다.*/
        System.out.println(message); // 명령어 끝에 반드시 세미콜론(;)을 붙여라!
      }
    }