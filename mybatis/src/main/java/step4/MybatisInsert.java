package step4;

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
        
        InputStream inputStream = Resources.getResourceAsStream("step4/mybatis-config.xml");
        
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
       
        Map<String, Object> data = new HashMap<>();
        data.put("title", "오호라 제목이래요");
        data.put("contents", "내용이래요");
        
        
        int count =sqlSession.insert("JdbcTestMapper.insert", data);
        sqlSession.commit();
        
        System.out.printf("%d 개가 입력 되었습니다.", count);
        
        sqlSession.close();
        System.out.println("종료!");
        
    }
    
}
