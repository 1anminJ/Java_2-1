package w13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    // 메소드
    // 리턴타입 method() { }
    static Connection dbConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
            System.out.println("sampledb 연결 완료");
            return conn;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("db 클래스 에러");
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("db 연결 에러");
            return null;
        }

    }
}
