package myTest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.ProgressMonitor;

/*
성적관리> add
이름? 홍길동
국어? 100
영어? 100
수학? 100
계속 입력하시겠씁니까?(Y/n) <== 'Y' 또는 'y' 그냥 엔터치기
이름? 임꺽정
국어? 90
영어? 90
수학? 90
성적관리> list
홍길동, 300, 100.0
임꺽정, 270, 90.0
> view 
이름? 홍길동
홍길동, 100, 100, 100, 300, 100.0
>delete
이름? 홍길동
정말 삭제하시겠습니까? (y/N)
만약 우헤헤를 입력하면 우헤헤의 성적정보가 없다고 출력하게 하라

update
이름? 홍길동
국어?(100) 80 <=엔터를 치면 원래점수 유지
영어?(100)
수학?(100) 90
변경하시겠습니까(y/N)

*/
 
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
        
        //제네릭이 적용된 ArrayList를 사용
        
        ArrayList<Score2> list = new ArrayList<>();
        
        int swi = 1;
        while(swi == 1) {
            System.out.print("성적관리> ");
            String promt = sc.next();
            Iterator<Score2> iterator = list.iterator(); 
            switch (promt) {
            case "add":
                while(true) {
                    Score2 score = new Score2();
                    score.input();
                    list.add(score);
                  
                   if(!confirm("계속하시겠습니까?(y/n)")) {
                            break;
                       
                        }
                }
                break;
                
            case "list":
                     
                while(iterator.hasNext()) {
                    iterator.next().print();
                }
                break;
            case "view":
                System.out.println("이름?");
                String nA = sc.next();
               
               while(iterator.hasNext()) {
                   iterator.next().printa(nA);
               }
               break;
            case "del":
                System.out.println("이름?");
                String del = sc.next();
                
                    for(int i=0; i <= list.size(); i++) {
                        
                        if(del.equals(iterator.next().name)) {
                        list.remove(i);
                        }
                    }
                    System.out.println(del+"님이 삭제되셨습니다.");
                    
              break;
            case "update": 
                System.out.println("어떤분을 수정하시겠습니까?");
                String name = sc.next();
               
               while(iterator.hasNext()) {
                   iterator.next().suJung(name);
               }
                System.out.println(name+"님 수정되셨습니다.");
                
                break;
            case "end":
                swi = 2;
                break;
                
                
                
            default:
                break;
            }
            
            
            
        }
        
        
        
        
        
    }
}




