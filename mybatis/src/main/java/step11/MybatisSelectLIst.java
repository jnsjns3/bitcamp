package step11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSelectLIst {

    public static void main(String[] args) throws Exception {
        
        ClassPathXmlApplicationContext iocContainer = new ClassPathXmlApplicationContext("step11/application-context.xml");
        
        
        BoardDao boardDao = iocContainer.getBean(BoardDao.class);
       
        
        // 오름차순을 하기 위해 정렬 정보를 맵 객체에 담아 selectList()에 담아 넘긴다
        Map<String, Object> data = new HashMap<>();
        data.put("orderColumn", "regdt");
        data.put("align", "desc");
        
        
        List<String> words = new ArrayList<>();
        words.add("x");
        words.add("1");
        words.add("3");
        
        //data.put("words", words);
        
        List<Board> records =boardDao.findAll(data);
        
        for(Board board : records) {
            System.out.printf("%d,%s,%s,%s\n",board.getNo(), board.getTitle(), board.getCreatedDate(), board.getViewCount());
            
        }
        
        System.out.println("종료!");
       iocContainer.close();
    }
      
    
}
