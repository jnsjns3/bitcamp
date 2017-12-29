package step9;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisDelete {

    public static void main(String[] args) throws Exception {
        
        BoardDao boardDao = new BoardDao();
        boardDao.setSqlSessionFactory(SqlSessionFactoryBean.getObject());
        
        int count = boardDao.delete(31);
        
        System.out.printf("%d 가 삭제되었습니다.", count);
        
        
        System.out.println("종료!");
        
    }
    
}
