package bitcamp.java100.ch15.ex8;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args)throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버 시작!");
        while(true) {
            Socket socket = ss.accept();
            System.out.printf("%s에서 접속하였습니다.\n",socket.getInetAddress().getHostAddress());
         
            service(socket);   
            System.out.println("접속 종료하였습니다.");
        }
        
    }

    private static void service(Socket socket) {
       try {
           //클라이언트와 데이터를 주고 받기 위한 스트림 객체 준비
           BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
           PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
           
          
           while(true) {
           String message = in.readLine();
           if(message.equals("quit")) {
               out.print("Goodbye!");
               out.flush();
               break;
           }
           String[] arr = message.split(" ");
           int a = Integer.parseInt(arr[0]);
           String op = arr[1];
           int b = Integer.parseInt(arr[2]);
           
           switch (op) {
        case "+": out.println(a+b); break;
        case "-": out.println(a-b); break;
        case "*": out.println(a*b); break;
        case "/": out.println(a/b); break;
        
        default: System.out.println("지원하지 않는 연산자 입니다."); break;
           
        }
           out.flush();
       }
        in.close();
        out.close();
        socket.close();
        
    } catch (Exception e) {
        System.out.println("클라이언트와 대화 도중 예외 발생");
    }
        
    }
    
}
