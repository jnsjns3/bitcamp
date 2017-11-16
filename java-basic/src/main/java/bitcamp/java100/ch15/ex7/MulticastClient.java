package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.Socket;
import java.util.Scanner;

// Connectionless 방식으로 통신하기
// 연결없이 데이터를 보낸다.
public class MulticastClient {

    public static void main(String[] args)throws Exception {
        
        Scanner sc = new Scanner(System.in);
       
        
        
        //비연결성 소켓 준비
       MulticastSocket socket = new MulticastSocket();
        
      
        
        InetAddress ip = InetAddress.getByName("238.1.2.3");
        
        //받는쪽 포트
        int port = 9999;
        while(true){
       
        System.out.print("보낼 메시지? ");
        String message = sc.nextLine();
        if(message.equals("quit")) {
            break;
        }
        
        byte[] bytes = message.getBytes("UTF-8");
        // 데이터를 보내기 위한 상자 준비
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, ip, port);
        
        
        socket.send(packet);
        System.out.println("데이터 출력 완료!");
        
        
        }
        socket.close();
        sc.close();
    }
   
    
}
