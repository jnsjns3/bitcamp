package bitcamp.java100.Test21_;

import bitcamp.java100.Test21_.Test21_Contact.Contact;

public class ContactArray {
    
    
    public static int cursor = 0;
    public static Contact[] contatcts = new Contact[100];
    
    public static void add(Contact contact) {
        if(cursor >= ContactArray.contatcts.length) {
            throw new RuntimeException("최대 저장 개수 초과");
        }
        contatcts[cursor] = contact;
        cursor++; 
    }
    
    public static Contact get(int index) {
        if(index < 0 || index >= cursor){
            throw new RuntimeException("유호하지 않은 인덱스");
            
        }
            return contatcts[index];
         
    }
    
    public static int size() {
        return cursor;
    }
    
}
