package bitcamp.java100.ch15.ex2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//네트워크 프로그래밍 : 대기열 다루기

public class Server {

    public static void main(String[] args) throws Exception {
        
        
        ServerSocket ss = new  ServerSocket(9999, 3); //3 : 동시연결 가능 수(becklog)
        System.out.println("서버를 실행하였다!");
        

        
        
        Scanner sc = new Scanner(System.in);
        //10번의 반복
        for(int i=0; i<10; i++) {
            System.out.println("클라이언트 승인 : ");
            sc.nextLine();
            
        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었슴");
        
        System.out.printf("%s, %d\n ", 
                 socket.getInetAddress().getHostAddress(),
                 socket.getPort());
        //클라이언트 정보를 출력한후 연결을 끊는다.    
        
            
        }
        
        ss.close();
        System.out.println("서버를 종료하였다!");
        
    }
    
}
