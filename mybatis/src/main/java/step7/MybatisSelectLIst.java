package step7;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectLIst {

    public static void main(String[] args) throws Exception {
        
        InputStream inputStream = Resources.getResourceAsStream("step7/mybatis-config.xml");
        
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
       
        
        List<Board> records =sqlSession.selectList("JdbcTestMapper.findAll");
        for(Board board : records) {
            System.out.printf("%d,%s,%s,%s\n",board.getNo(), board.getTitle(), board.getCreatedDate(), board.getViewCount());
            
        }
            
        
        sqlSession.close();
        System.out.println("종료!");
        
    }
    
}
