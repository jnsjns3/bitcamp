import java.io.Console;
import java.util.Scanner;

import javax.script.ScriptContext;

//- 키보드로 성적 정보를 입력 받아 저장하라!
//- 계속 저장할 지 여부를 물어봐라!
//- 저장을 완료하면 모든 성적을 출력하라!
// 생성자? : 인스턴스를 사용 가능하도록 유효한 상태로 만드는것.

 
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
        ScoreDao scoreDao = new ScoreDao();
        while(true) {
            Score score = new Score();
            score.input();
            
            scoreDao.add(score);
           
            if(!confirm("계속하시겠습니까?(y/n)")) {
                break;
            }
        }
        
        
        for(int i=0; i< scoreDao.size(); i++) {
            scoreDao.get(i).print();
        }
    }
}




