package w12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
            System.out.println("DB 연결 완료");
            Statement stmt = conn.createStatement();
            String sql1 = "insert into tb_student(id, sname, sdept) values('2023008', '정국', '아이돌과');";
            stmt.executeUpdate(sql1);
            stmt.executeUpdate("insert into tb_student(id, sname, sdept) values('2023009', '뷔', '아이돌과');");
            stmt.executeUpdate("update tb_student set sname = '김정국' where sname = '정국';");
            stmt.executeUpdate("delete from tb_student where sname = '임영웅';");
            System.out.println("변경 완료");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("드라이버 연결 에러");
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQL 실행 에러");
        }
    }
}