package w12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBTest1 {

    public static void main(String[] args) {
        try {
            // mysql과 연결
            Class.forName("com.mysql.cj.jdbc.Driver");
            // sample 연결
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
            System.out.println("DB 연결 성공");
            // sql 테이블 검색
            Statement stmt = conn.createStatement();
            String sql = "select * from tb_student";
            ResultSet result = stmt.executeQuery(sql);

            while(result.next()) {
                System.out.println(result.getString("id") + result.getString(2) + result.getString(3) + result.getString(4));
            }
            stmt.close();
            result.close();
            System.out.println("완료~~");
        } catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("드라이버 연결 에러 class not found~~");
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("SQL 에러");
        }
    }

}
