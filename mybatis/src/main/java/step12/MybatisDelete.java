package step12;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisDelete {

    public static void main(String[] args) throws Exception {
        
        ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("step12/application-context.xml");
        
       
        
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
        
        int count = boardDao.delete(32);
        
        System.out.printf("%d 가 삭제되었습니다.", count);
        
        
        System.out.println("종료!");
        iocContainer.close();
        
    }
    
}
