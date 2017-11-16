package bitcamp.java100.ch15.ex5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

//바이너리 데이터 전송하기
public class Client {

    public static void main(String[] args) throws Exception {
        
        File photo = new File("./sample/a.jpg");
        
        FileInputStream FileIn = new FileInputStream(photo);
        
        Socket socket = new Socket("localhost", 9999);
        
        DataOutputStream netOut = new DataOutputStream(socket.getOutputStream());
        
        
        long start = System.currentTimeMillis();
        //파일명을 보낸다, 파일크기랑
        netOut.writeUTF(photo.getName());
        netOut.writeLong(photo.length()); 
        
        int b;
        while((b=FileIn.read()) != -1) { //1바이트 읽어서
            netOut.write(b); //1바이트 보낸다.
        }
        
        DataInputStream netIn = new DataInputStream(socket.getInputStream());
        String response = netIn.readUTF();
        
        long end = System.currentTimeMillis();
        
        System.out.println(response);
        System.out.println(end-start);
        
        netOut.close();
        netIn.close();
        socket.close();
        FileIn.close();
        
    }
    
}
