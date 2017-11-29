package java100.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.annotation.Component;
import java100.app.beans.ApplicationContext;
import java100.app.domain.Member;
import java100.app.util.DataSource;


public interface MemberDao {

    List<Member> selectList(); 
    int insert(Member member); 
    int update(Member member);
    Member selectOne(int no); 
 


    
}
