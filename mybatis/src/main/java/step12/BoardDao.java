package step12;

import java.util.List;
import java.util.Map;

//Mybatis의 MapperScannerConfigurer 객체가 BoardDao 구현체를 자동으로 생성할 것이다.

public interface BoardDao {

        List<Board> findAll(Map<String, Object> data);
         Board findByNo(int no);
         int insert(Board board);
         int update(Board board);
         int delete(int no);
        
    
}
