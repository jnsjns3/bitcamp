package bitcamp.java100.ch15.ex1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Port(포트번호) : 컴퓨터에서 실행 중인 통신 프로그램을 구분하기 위핸 실행번호
//20, 21 : FTP서버 관련 포트번호
//22, 23 : 원격 접속 프로그램이 사용하는 포트번호
//80 : 웹서버
//8080 : 프록시서버
//443 :보안 웹서버(HTTPS)

public class Server {

    public static void main(String[] args) throws Exception {
        
        
        ServerSocket ss = new  ServerSocket(9999);
        System.out.println("서버를 실행하였다!");
        
        //클라이언트가 연결을 기다린다
        //->클라이언크 서버에 연결을 요청하면 클라이언트 정보가 서버의 대기열에 추가된다.
        //->accept()는 이 대기열에서 클라이언트는 정보를 가져와서 그 클라이언트와 데이터를 주고받을 수 있도록 도구(Socket 객체)를 만들어 리턴한다.
        Socket socket = ss.accept();
        
        System.out.println("클라이언트와 연결되었슴");
        System.out.printf("서버 IP = %s\n ", socket.getLocalAddress().getHostAddress());
        System.out.printf("서버 port = %d\n ", socket.getLocalPort());
        
        System.out.printf("클라이언트 IP = %s\n ", socket.getInetAddress().getHostAddress());
        System.out.printf("클라이언트 port = %d\n ", socket.getPort());
        
        
        
        ss.close();
        System.out.println("서버를 종료하였다!");
        
    }
    
}
