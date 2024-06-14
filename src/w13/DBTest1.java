package w13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class DBTest1 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "dongyang");
            System.out.println("sampledb 연결 완료");
//			// 1번 방식 state
//			Statement stmt = conn.createStatement();
//			// String sql1 = "insert studenttbl(id, name, dept) values('20240007', '홍길동', '체육과');";
//			// stmt.executeUpdate(sql1);
//			System.out.println("홍길동 입력 완료");
//			// String inid = "20240008", inname = "장원영", indept = "연예인과";
//			// String sql2 = "insert into studenttbl(id, name, dept) values "
//					// + "('" + inid + "', '" + inname + "', '" + indept + "');";
//			// stmt.executeUpdate(sql2);
//			System.out.println("장원영 입력 완료");
            // 2번 방식 PreparedStatement
            String sql3 = "insert into studenttbl(id, name, dept) values(?, ?, ?);";
            PreparedStatement prestmt = conn.prepareStatement(sql3);
            String inid = "20240009", inname = "안유진", indept = "연예인과";
            prestmt.setString(1,  inid);
            prestmt.setString(2,  inname);
            prestmt.setString(3,  indept);
            prestmt.executeUpdate();
            System.out.println("안유진 입력 완료");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
