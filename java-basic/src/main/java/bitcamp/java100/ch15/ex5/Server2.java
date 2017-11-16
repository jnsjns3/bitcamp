package bitcamp.java100.ch15.ex5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//버퍼 기능을 붙인다. (Decorator)데코레이터
public class Server2 {

    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        Socket socket = ss.accept();
        System.out.println("서버시작!");
         
        DataInputStream netin = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        //파일명 읽음
        
        
        String filename= netin.readUTF();
        
        BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("xx-"+filename));
        long lenght = netin.readLong();
        
        for(int i=0; i< lenght; i++) {
            fileOut.write(netin.read());
        }
        
        fileOut.flush();
         
        DataOutputStream netOut = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        
        netOut.writeUTF("success");
        netOut.flush();
        
        fileOut.close();
        netin.close();
        netOut.close();
        socket.close();
        ss.close();
    
    }
    
    
    
}
