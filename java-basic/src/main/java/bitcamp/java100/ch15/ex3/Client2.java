package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// 네트워크 프로그래밍 : 사용자가 입력한 데이터 보내기
public class Client2 {

    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("보낼 메시지: ");
        String message = sc.nextLine();
        
        System.out.println("서버주소: ");
        String serverAddr = sc.nextLine();
        sc.close();
        
        Socket socket =new Socket(serverAddr, 9999);
        System.out.println("서버와 연결되었다!");
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        out.println(message);
        
        Scanner in = new Scanner(socket.getInputStream());
        String line = in.nextLine();
        
        System.out.println(line);
        
        out.close();
        in.close();
        socket.close();
        
    }
    
}
