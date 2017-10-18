package bitcamp.java100;

public class Test18_5{
    
  public static void main(String[] args)throws Exception {
    
    String s1 = "ABC가각간";
    
    String s2 = s1.replace("BC" , "하하하");
    
    System.out.println(s1);
    System.out.println(s2);
    
    s1 = "ABBCDEBBFGH";
    
    
    System.out.println(s1.charAt(4)); //위치번호는 0부터 시작
    System.out.println(s1.indexOf("BB")); // 찾을문자열 (앞에서부터 찾는다)
    
    System.out.println(s1.lastIndexOf("BB")); //찾을 문자열 (뒤에서 부터 찾는다)
    System.out.println(s1.substring(3)); //추출할 문자열의 시작 인덱스
    System.out.println(s1.substring(3, 6)); //시작 인덱스의 문자부터 끝 인덱스의 문자까지 출력
  
    s1="홍길동";
    System.out.println(s1.startsWith("홍길")); //해당문자열이 주어진 문자열로 시작하는지 검사한다.
    System.out.println(s1.startsWith("길")); //해당문자열이 주어진 문자열로 시작하는지 검사한다.
    System.out.println(s1.endsWith("동")); //해당문자열이 주어진 문자열로 끝나는지 검사
    
    s1="홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
    //해당 문자열이 주어진 문자열이 있는지 검사한다.
    System.out.println(s1.contains("꺽정"));
    System.out.println(s1.contains("김꺽정"));
    
    String s3="ABC";
    String s4="가각간";
    //해당문자열에 주어진 문자열을 추가하여 새 String 인스턴스를 만든다.
    System.out.println(s3.concat(s4));
    System.out.println(s3);
    
    s3 = new String("탕수육");
    s4 = new String("탕수육2");
    String s5 = new String("탈수육");
    String s6 = new String("탕수육");
    
    // 문자열1이 문자열2 보다 앞서면 음수를 리턴한다.
    // 문자열1이 문자열2 보다 뒤면 양수를 리턴한다.
    System.out.println(s3.compareTo(s6));
    System.out.println(s3.compareTo(s4));
    System.out.println(s3.compareTo(s5));
    
    s1="홍길동";
    s2="";
    s3=null;
    
    //값이 비어있는지 확인
    System.out.println(s1.isEmpty());
    System.out.println(s2.isEmpty());
    //System.out.println(s3.isEmpty());
   
    System.out.println(s1.length());
    System.out.println(s2.length());
    //System.out.println(s3.length());
    s1="홍길동,유관순,임꺽정,안중근,윤봉길,이육사,윤동주";
    
    //split(구분자) > 해당문자열을 구분자로 분리하여 String[] 배열을 만들어 리턴한다.
    String[] arr = s1.split(",");
    for(String s : arr) {
        System.out.print(s);
        System.out.print("-");
        
    }
    System.out.println();
    
    String[] arr1 = s1.split(",");
    for(String s : arr1) {
        System.out.print(s);
        System.out.print("  ");
        
    }
    System.out.println();
    
    arr = s1.split(" ");
    System.out.println(arr.length);
    System.out.println(arr[0]);
    
    //빈문자열도 문자열이기 때문에 배열로 리턴된다.
    s1="";
    arr = s1.split(",");
    System.out.println(arr.length);
    System.out.println(arr[0]);
  
    s1="Hong Gil Dong";
    System.out.println(s1.toLowerCase());
    System.out.println(s1.toUpperCase());
    
    // > 해당 문자열의 양쪽에 존재하는 공백을 제거한다.
    s1 = "  \t홍\t길 동 \n입니다.  \n\n\n\t\n";
    System.out.print(">");
    System.out.print(s1.trim());
    System.out.println("<");
    
    
    s1="ABC\n가각간\n똘똥똠";
    // 해당 문자열을 JVM에 설정된 문자집합의 코드 값으로 추출한다.
    // 추출한 문자 코드는 바이트 배열에 저장되어 리턴한다.
  
    byte[] bytes = s1.getBytes();
    for(byte b : bytes) {
        System.out.print(Integer.toHexString(b & 0x0ff));
        System.out.print(" ");
    }
    System.out.println();
    
    //주어진 값을 가지고 String 인스턴스를 생성하는 메서드이다.
    s1 = String.valueOf(true);
    s2 = String.valueOf(3.14);
    s3 = String.valueOf(100);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    
    // getBytes(문자집합)
    // 가능한 문자 집함을 명시하여 바이트 배열을 만들라!
    // OS에 상관없이 동일한 결과를 얻을 수 있다.
    bytes = s1.getBytes("UTF-8");
    for(byte b : bytes) {
        System.out.print(Integer.toHexString(b & 0x0ff));
        System.out.print(" ");
    }
    System.out.println();
    
    s1 = "ABC";
    s2 = "가각간";
    s3 = s1+s2;
    
    System.out.println(s3);
    
  }
  
  
  }
  
  

        

   


   