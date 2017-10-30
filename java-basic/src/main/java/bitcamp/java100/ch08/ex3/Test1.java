package bitcamp.java100.ch08.ex3;

import java.util.Scanner;

//다형성 : 오버라이딩 사용전!
public class Test1 {

    
    public static void main(String[] args) {
        
        Scanner keyScan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        
        
        while(true) {
            
            Score s = new Score();
            
            s.setNo(Prompts.inputInt("번호?"));
            s.setName(Prompts.inputString("이름?"));
            s.setKor(Prompts.inputInt("국어?"));
            s.setEng(Prompts.inputInt("영어?"));
            s.setMath(Prompts.inputInt("수학?"));
            
            list.add(s);
            
            System.out.println(s.toString()); //간략하게 문자열 값이 넘어왔는지 확인해보고 싶을떄
            
            if (Prompts.confirm("계속 하시겠습니까?")) {
                break; // if문에 true 자동 생략
            }
            
            
        }
        
    }
}
