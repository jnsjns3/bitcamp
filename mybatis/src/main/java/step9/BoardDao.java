package step9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class BoardDao {

    SqlSessionFactory sqlSessionFactory;
    
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    


        public List<Board> findAll(Map data){
            
            try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
                
                return sqlSession.selectList("JdbcTestMapper.findAll", data);
            }
        
        }
        
        public Board findByNo(int no){
            
            try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
                
                return sqlSession.selectOne("JdbcTestMapper.findByNo", no);
            }
        
        }
    
        public int insert(Board board){
            
            try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
                int count = sqlSession.insert("JdbcTestMapper.insert", board);
                sqlSession.commit();
                return count;
            }
        
        }
    
        public int update(Board board){
            
            try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
                
                int count =  sqlSession.update("JdbcTestMapper.update", board);
                sqlSession.commit();
                return count;
            }
        
        }
        
        public int delete(int no){
            
            try(SqlSession sqlSession = sqlSessionFactory.openSession()) {
                
                int count = sqlSession.delete("JdbcTestMapper.delete", no);
                sqlSession.commit();
                return count;
            }
        
        }
        
    
}
