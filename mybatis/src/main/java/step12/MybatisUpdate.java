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

public class MybatisUpdate {

    public static void main(String[] args) throws Exception {
        
        ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("step12/application-context.xml");
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
       
        Board board = new Board();
        board.setNo(32);
        board.setTitle("제목 변경3!");
        board.setContents("내용 변경3!");
        
        
        int count = boardDao.update(board);
        
        System.out.printf("%d 개가 변경 되었습니다.", count);
        
      
        System.out.println("종료!");
        
    }
    
}
