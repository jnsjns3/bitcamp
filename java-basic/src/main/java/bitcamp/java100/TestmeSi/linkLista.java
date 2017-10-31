package bitcamp.java100.TestmeSi;

public class linkLista {

   Box head;
   Box tail;
   
   int len;
   
   public void add(Object value) {
       
       Box box = new Box();
       box.value = value;
      
       if(tail == null) {
           head = box;
           tail = box;
       }else {
           tail.next = box;
           tail = box;
          
       }
      len++;
   }
      
   public Object get(int index) {

       if(index == 0) {
           return head.value;
       }
       
       return head.value;
       
   }
   
   
}
