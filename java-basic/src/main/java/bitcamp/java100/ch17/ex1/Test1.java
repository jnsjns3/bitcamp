package bitcamp.java100.ch17.ex1;

import com.mysql.jdbc.Driver;

// JDBC Driver 정보 조회
public class Test1 {

    public static void main(String[] args) throws Exception {
        
        java.sql.Driver driver = new com.mysql.jdbc.Driver();
        
        System.out.println(driver.getMajorVersion());
        System.out.println(driver.getMinorVersion());
        System.out.println(driver.toString());
        
        
    }
    
}
