package step9;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUpdate {

    public static void main(String[] args) throws Exception {
        
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
       
        Board board = new Board();
        board.setNo(27);
        board.setTitle("제목 변경2!");
        board.setContents("내용 변경2!");
        
        
        int count = boardDao.update(board);
        
        System.out.printf("%d 개가 변경 되었습니다.", count);
        
      
        System.out.println("종료!");
        
    }
    
}
