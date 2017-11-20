package kr.co.bitcamp.java100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {

    public static void main(String[] args)throws Exception {
        
        ServerSocket ss = new ServerSocket(9999);
        System.out.println("서버 시작!");
        Socket socket =ss.accept();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        
        out.println("HTTP/1.1 200 OK");
        
        out.println("Server: Simple http Server");
        out.println("Content-Type: text/html; charset=UTF-8");
        out.println();
        out.println("<html><head><title>하하하</title></head>");
        out.println("<body><h1>안녕하세요!!</h1>");
        out.println("<h2>반갑습니다!!</h2>");
        out.println("</body></html>");
        out.flush();
        
        
        
        
    }
    
}
