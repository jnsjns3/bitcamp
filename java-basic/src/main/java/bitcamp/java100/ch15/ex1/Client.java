package bitcamp.java100.ch15.ex1;

import java.net.Socket;

//서버에 연결 요청한다.
//-> 서버 주소는 IP Adderess 또는 도메인 이름 모두 가능하다.
//   도메인 명을 주면 내부적으로 DNS 서버에 요청하여 그 도메인에 대한 IP Address를 알아낸 다음에 
//   그 IP Address로 접속할 것이다.
//  참고 : localhost 현재 컴퓨터를 가리키는 도메인 명
public class Client {

    public static void main(String[] args) throws Exception {
        
        
        Socket socket =new Socket("192.168.0.62", 9999);
        System.out.println("서버와 연결되었다!");
        
        
        System.out.printf("클라이언트 IP = %s\n ", socket.getLocalAddress().getHostAddress());
        System.out.printf("클라이언트 port = %d\n ", socket.getLocalPort());
        
        System.out.printf("서버 IP = %s\n ", socket.getInetAddress().getHostAddress());
        System.out.printf("서버 port = %d\n ", socket.getPort());
        
        socket.close();
        
    }
    
}
