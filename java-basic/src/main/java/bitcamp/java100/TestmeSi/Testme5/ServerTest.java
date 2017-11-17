package bitcamp.java100.TestmeSi.Testme5;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import com.google.common.net.InetAddresses;

public class ServerTest {

    public static void main(String[] args)throws Exception {
        
        
        MulticastSocket socket = new MulticastSocket(9999);
        System.out.println("서버 시작!");
        
        InetAddress join = InetAddress.getByName("238.1.2.3");
        socket.joinGroup(join);
        
        byte[] buf = new byte[1024];
        
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        while(true) {
            
            socket.receive(packet);
            
            String message = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
            
            System.out.println(message);
            
            
        }
        
    }
    
}
