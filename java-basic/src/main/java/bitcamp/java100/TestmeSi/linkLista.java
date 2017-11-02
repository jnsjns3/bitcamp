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
       Box pre = head;
       for(int i=0; i< index; i++) {
           pre = pre.next;
       }
      
       return pre.value;
       
       
   }
   
   public void insert(int index, Object value) {
       
       Box box = new Box();
       box.value = value;
       
       if(index==0) {
           box.next = head;
           head = box;    
       }
       Box pre = head;
       for(int i=1; i< index; i++) {
           pre = pre.next;
       }
       
       box.next = pre.next;
       pre.next = box;
       
       
       System.out.println(pre.value);
       System.out.println("---------------------");
       len++;
   }
   
   public Object delete(int index) {
       
       Box del;
      
       if(index==0) {
           del = head;
           head = head.next;
           len --;
           return del;
       }
       Box pre = head;
       for(int i=1; i< index; i++) {
           pre = pre.next;
       }
       del = pre.next;
       pre.next = pre.next.next;
       
       len --;
     
       return del;
   }
   
   
}
