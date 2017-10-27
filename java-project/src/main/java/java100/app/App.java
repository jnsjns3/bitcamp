package java100.app;
import java.util.Scanner;

//- 키보드로 성적 정보를 입력 받아 저장하라!
//- 계속 저장할 지 여부를 물어봐라!
//- 저장을 완료하면 모든 성적을 출력하라!
// 생성자? : 인스턴스를 사용 가능하도록 유효한 상태로 만드는것.
//: 캡슐화 문법을 적용하라!
//: setter / getter의 정의와 사용을 연습한다!
 
public class App {
    
    static boolean confirm(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String response = sc.nextLine().toLowerCase();
        
        if(response.equals("y") || response.equals("yes")) 
            return true;
        
            return false;
        
    }
    
    
    
    public static void main(String[] args) {
        // Score 설계도에 따라 메모리를 준비한다.
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList list = new ArrayList();
        while(true) {
            Score score = new Score();
            score.input();
            
            list.add(score);
           
            if(!confirm("계속하시겠습니까?(y/n)")) {
                break;
            }
        }
        
        
        for(int i=0; i< list.size(); i++) {
            //list.get(i).print();
            //해결책?
            // 방법.1
            // Score s = (Score)list.get(i);
            // s.print();
            // 방법.2
         
            ((Score)list.get(i)).print();
            
            
        }
    }
}




