package myTest3;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java100.app.annotation.Component;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;
import java100.app.domain.Score;

@Component("/member")
public class MemberController implements Controller {
    
    MemberDao memberDao;
    
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    
    @Override
    public void destroy() {
          
    }
    @Override
    public void init() {}
    
    
    @Override
    public void excute(Request request, Response response) {
        
         
           switch (request.getMenuPaht()) {
        case "/member/add":
            this.doAdd(request, response); break;
            
        case "/member/list":
            this.doList(request, response); break;
            
        case "/member/view":
            this.doView(request, response); break;
            
        case "/member/update":
            this.doUpdate(request, response); break; 
            
        case "/member/delete":
            this.doDelete(request, response); break;
       
              
        default:
            response.getWriter().println("해당 명령이 없습니다"); break;
            
        }
            
    
    }
     
    private void doList(Request request, Response response){
        PrintWriter out = response.getWriter();
        
        out.println("[회원 목록]");
        
        try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
                PreparedStatement pstmt = con.prepareStatement("select no, name, email, regdt from ex_memb");
                ResultSet rs = pstmt.executeQuery();) {
            
            
            while(rs.next()) {
                
                out.printf("%d, %s, %s, %s\n",  
                        rs.getInt("no"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getDate("regdt"));
                
                       }
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
        
    }
    
    private void doAdd(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[회원 등록]");
        
        try{
            Member member = new Member();
            member.setName(request.getParameter("name"));    
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("pwd")); 
                 
           memberDao.insert(member);
            out.println("저장하였습니다.");
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
            
          
   }
    private void doView(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[회원 상세 정보]");
       
 try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            Member member = memberDao.selectOne(no);
            
            if(member != null) {
                
                out.printf("번호: %d\n", member.getNo());
                out.printf("이름: %s\n", member.getName());
                out.printf("이메일: %s\n", member.getEmail());
                out.printf("암호: %s\n", member.getPassword());
                out.printf("날짜: %s\n", member.getCreateDate());
             
           }else {
                out.printf("'%d' 의 회원 정보가 없습니다.\n", no);
                           
             }
                        
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
            
   }
    
    private void doUpdate(Request request, Response response) {
        PrintWriter out = response.getWriter();
        
        out.println("[회원 정보 변경]");
        
        try {
            
            Member member = new Member();
            member.setNo(Integer.parseInt(request.getParameter("no")));
            member.setName(request.getParameter("name"));    
            member.setEmail(request.getParameter("email"));
            member.setPassword(request.getParameter("pwd"));
            
            memberDao.update(member);
          
           out.println("저장하였습니다.");
            
            if(memberDao.update(member) > 0) {
                out.println("변경하였습니다.");
            }else {
                out.printf("'%s'의 성적 정보가 없습니다.\n", member.getNo());
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getMessage());
        }
       
   }
    private void doDelete(Request request, Response response) {
        PrintWriter out = response.getWriter();
          
          try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb", "study", "1111");
                  PreparedStatement pstmt = con.prepareStatement("delete from ex_memb where no = ?");
                  ) {
              
              pstmt.setInt(1, Integer.parseInt(request.getParameter("no")));
              
              if(pstmt.executeUpdate() > 0) {
                  
                 out.println("삭제됬습니다.");
               
              }else {
                  out.printf("%s 의 회원 정보가 없습니다.\n", request.getParameter("no"));
                             
              }
                          
          } catch (Exception e) {
              e.printStackTrace();
              out.println(e.getMessage());
          }
           
        }
        
       
    
    
}
