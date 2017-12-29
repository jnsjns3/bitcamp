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

public class MybatisInsert {

    public static void main(String[] args) throws Exception {
        
ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("step12/application-context.xml");
        
        String[] names = iocContainer.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(iocContainer.getBean(name).getClass().getName());
        }
        
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
       
        Board board = new Board();
        board.setTitle("추가 되냐~2");
        board.setContents("추가입니다2!");
        
        int count = boardDao.insert(board);
        
        System.out.printf("%d 개가 입력 되었습니다.", count);
        
       
        System.out.println("종료!");
        iocContainer.close();
        
    }
    
}
