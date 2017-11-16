package bitcamp.java100.ch15.ex6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//URL scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]

public class HTTPClient {

    public static void main(String[] args) throws Exception {
        
        Socket socket = new Socket("www.etnews.com", 80);
        
        //HTTP 요청
      
       PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
        
       out.println("GET / HTTP/1.1");
       
       
       //헤더 출력
       out.println("Host: www.etnews.com");
       out.println();
       out.flush();
       //HTTP 서버의 응답을 읽을 스트림 준비
      
       BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
       
       
       String line;
       while(true) {
          line = in.readLine();
          System.out.println(line);
          if(line.equals("")) {
              break;
          }
       
       }
       
       int b;
       while((b=in.read()) != -1) {
           System.out.print((char)b);
       }
       
       out.close();
       in.close();
       socket.close();
       //HTTP 응답 프로토콜
       // 1) response status
       
       
    }
    
}
