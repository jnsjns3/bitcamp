package bitcamp.java100.ch15.ex5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        Socket socket = ss.accept();
        System.out.println("서버시작!");
        DataInputStream netin = new DataInputStream(socket.getInputStream());
        //파일명 읽음
        String filename= netin.readUTF();
        
        FileOutputStream fileOut = new FileOutputStream("xx-"+filename);
        long lenght = netin.readLong();
        
        for(int i=0; i< lenght; i++) {
            fileOut.write(netin.read());
        }
        
        DataOutputStream netOut = new DataOutputStream(socket.getOutputStream());
        netOut.writeUTF("success");
        
        fileOut.close();
        netin.close();
        netOut.close();
        socket.close();
        ss.close();
    
    }
    
    
    
}
