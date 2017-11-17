package bitcamp.java100.TestmeSi.Testme5;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class ClientTest {

    public static void main(String[] args)throws Exception {
        
        Scanner sc = new Scanner(System.in);
        MulticastSocket socket = new MulticastSocket();
        
        InetAddress ip = InetAddress.getByName("238.1.2.3");
        int port = 9999;
        
        while(true) {
        System.out.println("보낼 메세지?");
        String message = sc.nextLine();
        
        byte[] bytes = message.getBytes("UTF-8");
            
            
       DatagramPacket data = new DatagramPacket(bytes, bytes.length, ip, port);
       
       socket.send(data);
       System.out.println("데이터 출력 완료");
               
        }
        
        
       
        
        
    }
    
}
