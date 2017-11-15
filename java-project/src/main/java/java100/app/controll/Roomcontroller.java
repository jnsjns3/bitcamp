package java100.app.controll;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.domain.Room;
import java100.app.domain.Score;
import java100.app.util.Prompts;

public class Roomcontroller extends ArrayList<Room> implements Controller {
    
    
    private static final long serialVersionUID = 1L;

    Scanner sc = new Scanner(System.in);
    
    private String dataFilePath;
    
    public Roomcontroller(String dataFilePath) {
        this.dataFilePath = dataFilePath;
        this.init();
    }
    
    @Override
    public void destroy() {
        
      
        try (PrintWriter out = new PrintWriter
                (new BufferedWriter
                        (new FileWriter(this.dataFilePath)));){
            
            
            for(Room room : this) {
                out.println(room.toCSVString());
            }
            out.flush();
           
        } catch (IOException e) {
            e.printStackTrace();
        
        }
        
    }
    @Override
    public void init() {
        try(BufferedReader in = new BufferedReader(
                new FileReader(this.dataFilePath));    
                ) {
            
            String csv = null;
            while((csv=in.readLine()) != null) {
              
                try {
                    this.add(new Room(csv));
                } catch (CSVFormatException e) {
                    System.err.println("CSV 데이터 형식 오류!");
                    e.printStackTrace();
                }
            
            
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
} 
    
    
    @Override
    public void excute() {
        loop:
            while(true) {
           System.out.println("강의실관리> ");
           
           String input = sc.nextLine();
          
           switch (input) {
        case "add":
            this.doAdd(); break;
            
        case "list":
            this.doList(); break;
        
         
        case "delete":
            this.doDelete(); break;
            
        case "main":
            break loop;
              
        default:
            System.out.println("해당 명령이 없습니다"); break;
            
        }
            }
    
    }
    private void doList(){
        System.out.println("[강의실 목록]");
        Iterator<Room> iterator;
        iterator = this.iterator();
        while(iterator.hasNext()) {
            Room room = iterator.next();
            System.out.printf("%s, %s, %d\n", room.getLocation(), room.getName(), room.getCapacity());
        }
    }
    
    private void doAdd() {
        System.out.println("[강의실 등록]");
        Room room = new Room();
       
       
        room.setName(Prompts.inputString("강의실 이름?"));
        if(find(room.getName()) != null) {
            System.out.println("이미 등록된 강의실 입니다.");
            return;
        }
        
        room.setLocation(Prompts.inputString("지역??"));
        room.setCapacity(Prompts.inputInt("수용인원? "));
        this.add(room);
            
            
          
   }
   
    
    private void doDelete() {
        System.out.println("[강의실 삭제]");
        String roomName = Prompts.inputString("강의실 이름? ");
        
        Room room = find(roomName);
        
        if(room == null) {
            System.out.printf("%s 의 강의실 정보가 없습니다.\n", roomName);
           return;
        }
            if(Prompts.confirm2("정말 삭제 하시겠습니까?(y/n)")) {
                this.remove(room);
            }else {
                System.out.println("삭제를 취소하였습니다.");
            }
           
        }
        
        
   
    
    private Room find(String roomName) {
        Iterator<Room> iterator;
        
        iterator = this.iterator();
        while(iterator.hasNext()) {
            Room room = iterator.next();
            if(room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }
    
    
}
