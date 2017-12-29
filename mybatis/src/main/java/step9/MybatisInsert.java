package step9;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisInsert {

    public static void main(String[] args) throws Exception {
        
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
       
        Board board = new Board();
        board.setTitle("추가 되냐~2");
        board.setContents("추가입니다2!");
        
        int count = boardDao.insert(board);
        
        System.out.printf("%d 개가 입력 되었습니다.", count);
        
       
        System.out.println("종료!");
        
    }
    
}
