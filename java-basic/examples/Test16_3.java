package bitcamp.java100;


public class Test16_3{
 

    public static void main(String[] args) {
        
        //switch (식) {
        //case 값: 명령어
            
            //break;

        //default: 명렁어
            //break;
        //}
   
        int level = 2;
        switch (level) {
        case 0: System.out.println("손님"); break;
        case 1: System.out.println("회원"); break;
        case 2: System.out.println("관리자"); break;
        
            
        default:System.out.println("유효하지 않은 회원입니다.");
           
        }
        
        byte b = 10;
        short s = 10;
        int i = 100;
        char c = 100;
        
        long l = 100;
        float f = 100;
        double d = 100;
        boolean bool = true;
        String st = "good";
        
        switch (b) {}
        switch (s) {}
        switch (i) {}
        switch (st) {}
        
        
        //switch (l) {}
        //switch (f) {}
        //switch (d) {}
        //switch (bool) {}
        
        
        String v1 = "노인";
        level = 2;
        switch (v1) {
        case"유아 ":
        case "노인": System.out.println("무료승차"); break;
        case"어린이 ":
        case"중학생":
        case"고등학생 ":
        case "미성년": System.out.println("무료승차"); break;
        case"성인 ": 
        case "외국인": System.out.println("무료승차"); break;
        default: System.out.println("요금계산 불가");
        
    }
}
}
    

   