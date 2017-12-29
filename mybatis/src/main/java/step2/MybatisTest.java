package step2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// Mybatis를 사용하기 위한 최소한의 준비
/*
 * 1) Mybatis 설정 파일을 준비한다.
 * 2) SQL문이 들어있는 XML 파일을 준비한다.
 *      - JdbcTestMapper.xml 생성
 * 3) SqlSessionFactory 객체를 준비한다.
 */

public class MybatisTest {

    public static void main(String[] args) throws Exception {
        
        InputStream inputStream = Resources.getResourceAsStream("step2/mybatis-config.xml");
        
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
       
        
        sqlSession.close();
        System.out.println("종료!");
    }
    
}
