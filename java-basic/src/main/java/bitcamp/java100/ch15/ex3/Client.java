package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// 네트워크 프로그래밍 : 데이터 주고받기
public class Client {

    public static void main(String[] args) throws Exception {
        
        
        Socket socket =new Socket("localhost", 9999);
        System.out.println("서버와 연결되었다!");
        
        PrintStream out = new PrintStream(socket.getOutputStream());
       
        out.println("hello");
        
        Scanner in = new Scanner(socket.getInputStream());
        String line = in.nextLine();
        
        System.out.println(line);
        
        out.close();
        in.close();
        socket.close();
        
    }
    
}
