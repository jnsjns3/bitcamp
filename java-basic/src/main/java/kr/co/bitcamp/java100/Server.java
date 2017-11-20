package kr.co.bitcamp.java100;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static class MyThr extends Thread {
		
		Socket socket;
		public MyThr(Socket socket) {
			this.socket = socket;
			
		}
		
		@Override
		public void run() {
			
			while(true) {
				
				try {
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				String command = in.readLine();
				
				String[] str = command.split(" ");
				int su1 = Integer.parseInt(str[0]);
				int su2 = Integer.parseInt(str[2]);
				int su3 = 0;
				
				String count = str[1];
				switch (count) {
				case "+": su3 = su1 + su2;
						out.println(su3);
						out.flush();
					break;

				default:
					break;
				}
				
				}catch (Exception e) {
				 System.out.println("예외!");
				}
		}
		
	}
	}
	
	public static void main(String[] args)throws Exception {
		
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("서버 시작!");
		Socket socket = ss.accept();
		MyThr tr = new MyThr(socket);
		
		tr.start();
		
			
			
		}
		
	}
	

