package java100.app;

import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

import javax.sound.sampled.Port;

import java100.app.control.ScoreController;
import java100.app.dao.mysql.ScoreDaoImpl;
import java100.app.domain.Score;

public class Test {

    public static void main(String[] args) throws Exception {
        
        Properties proty = new Properties();
        FileReader in = new FileReader("./bin/application-context2.properties");
        
            proty.load(in);
            Set<Object> keySet =proty.keySet();
            for(Object key : keySet) {
                String keyName = (String)key;
               //System.out.println(proty.getProperty(keyName)); 
                //Class<?> clazz = Class.forName(proty.getProperty(keyName));
                //clazz.newInstance();
               //System.out.println(proty.getProperty(keyName));
               if(proty.getProperty(keyName).contains(".ScoreDaoImpl")) {
                   Class<?> clazz2 = java100.app.dao.mysql.ScoreDaoImpl.class;
                   ScoreDaoImpl score2 =(ScoreDaoImpl)clazz2.newInstance();
                   System.out.println(score2.toString());
                   
                   Class<?> clazz = Class.forName(proty.getProperty(keyName));
                  ScoreDaoImpl score =(ScoreDaoImpl) clazz.newInstance();
                  
                  System.out.println(score.toString());
               }
                   
               //Class<?> clazzz = Class.forName(proty.getProperty(keyName));
                //ScoreDaoImpl score = (ScoreDaoImpl) clazzz.newInstance();
                //score.update(score)
               
                
            }
           
            
          
            
            
        
        
        
        
    }
    
}
