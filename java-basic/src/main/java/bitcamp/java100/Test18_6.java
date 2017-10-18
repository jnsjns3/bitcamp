package bitcamp.java100;

public class Test18_6{
    
  public static void main(String[] args)throws Exception {
    
      String email = "hong@test.com";
      if(email.contains("@") && email.contains(".com")) {
          System.out.println("적합!");
      }else {
         System.out.println("부적합 이메일 입니다.");
      }
      //정규표현식(Regular Expression)의 규칙과 맞는지 검사한다. 규칙이 똑같이 맞아야됨!
    System.out.println(email.matches("1hong@test.com"));
    
    System.out.println(email.matches(".+@.+\\..+"));
    System.out.println(email.matches("^\\D.+@.+\\..+"));
    //java.util.regex.Pattern 클래스의 API문서를 참조하라!
    
    System.out.println("------------------------------------------------------");
    String str = "홍길동(hong@test.com,임꺽정(leem@test.com)"
            + "유관순(yoo@test),안중근(ahn@test.com),윤봉길(yoon@test.com))";
 
    
    java.util.regex.Pattern pattern = 
            java.util.regex.Pattern.compile("\\w+@\\w+\\.\\w+");
    
    java.util.regex.Matcher matcher = pattern.matcher(str);
    int startIndex=0;
    
    while(matcher.find(startIndex)) {
        
        String maString = matcher.group();
        startIndex = matcher.end();
        
        System.out.println(maString);
       
    }
  
  }
  
  
  }
  
  

        

   


   