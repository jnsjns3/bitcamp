package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//네트워크 프로그래밍 : 데이터 주고받기

public class Server {

    public static void main(String[] args) throws Exception {
        
        
        ServerSocket ss = new  ServerSocket(9999); //3 : 동시연결 가능 수(becklog)
        System.out.println("서버를 실행하였다!");
        
      
        Socket socket = ss.accept();
        
        Scanner in = new Scanner(socket.getInputStream());
        String line = in.nextLine();
        
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(line);
        
        
        
        in.close();
        out.close();
        socket.close();
        ss.close();
        System.out.println("서버를 종료하였다!");
        
    }
    
}
