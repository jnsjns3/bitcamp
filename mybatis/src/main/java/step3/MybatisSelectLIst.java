package step3;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisSelectLIst {

    public static void main(String[] args) throws Exception {
        
        InputStream inputStream = Resources.getResourceAsStream("step3/mybatis-config.xml");
        
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
       
        
        List<Map> records =sqlSession.selectList("JdbcTestMapper.findAll");
        for(Map record : records) {
            System.out.printf("%d,%s,%s,%s\n", record.get("no"), record.get("title"), record.get("regdt"), record.get("vwcnt"));
        }
            
        
        sqlSession.close();
        System.out.println("종료!");
        
    }
    
}
