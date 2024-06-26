package w13_h;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class jusolok extends JFrame {
    private JButton insert;
    private JButton select;
    private JButton search;
    private JButton update;
    private JButton delete;
    private JButton exit;
    private JTextField tfname;
    private JTextField tftel;
    private JTextField tfcom;
    Connection conn;
    Statement stmt;
    ResultSet rs;

    jusolok() {
        this.setTitle("homework");
        this.setDefaultCloseOperation(3);
        this.createGUI();
        this.insert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jusolok.this.dbInsert();
            }
        });
        this.select.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jusolok.this.dbSelect();
            }
        });
        this.search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jusolok.this.dbSearch();
            }
        });
        this.update.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jusolok.this.dbUpdate();
            }
        });
        this.delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jusolok.this.dbDelete();
            }
        });
        this.exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.setSize(300, 270);
        this.setVisible(true);
    }

    public void createGUI() {
        GridLayout grid = new GridLayout(6, 2);
        grid.setVgap(6);
        Container c = this.getContentPane();
        c.setLayout(grid);
        c.add(new JLabel("이름"));
        this.tfname = new JTextField("");
        c.add(this.tfname);
        c.add(new JLabel("전화번호"));
        this.tftel = new JTextField("");
        c.add(this.tftel);
        c.add(new JLabel("회사이름"));
        this.tfcom = new JTextField("");
        c.add(this.tfcom);
        this.insert = new JButton("입력");
        this.select = new JButton("조회");
        this.search = new JButton("검색");
        this.update = new JButton("수정");
        this.delete = new JButton("삭제");
        this.exit = new JButton("종료");
        c.add(this.insert);
        c.add(this.select);
        c.add(this.search);
        c.add(this.update);
        c.add(this.delete);
        c.add(this.exit);
    }

    public void dbInsert() {
        try {
            this.conn = jusolok.DBConn.dbConnection();
            this.stmt = this.conn.createStatement();
            String in_name = this.tfname.getText().toString();
            String in_tel = this.tftel.getText().toString();
            String in_com = this.tfcom.getText().toString();
            String sql = "insert into addrtbl(name, tel, com) values ('" + in_name + "', '" + in_tel + "', '" + in_com + "');";
            this.stmt.executeUpdate(sql);
            System.out.println("입력 완료");
            this.tfname.setText("");
            this.tftel.setText("");
            this.tfcom.setText("");
            this.stmt.close();
            this.conn.close();
        } catch (Exception var5) {
            var5.printStackTrace();
            System.err.println("입력 에러");
        }

    }

    public void dbSelect() {
        try {
            this.conn = jusolok.DBConn.dbConnection();
            this.stmt = this.conn.createStatement();
            this.rs = this.stmt.executeQuery("select * from addrtbl;");
            String line = "";
            System.out.println("      이름         전화번호           회사이름");
            System.out.println("------------------------------------------------------");

            while(this.rs.next()) {
                String name = this.rs.getString("name");
                String tel = this.rs.getString("tel");
                String com = this.rs.getString("com");
                line = " | " + name + " | " + tel + " | " + com + "\n";
                System.out.println("rs => " + line);
            }

            this.stmt.close();
            this.conn.close();
        } catch (Exception var5) {
            var5.printStackTrace();
            System.err.println("조회 에러");
        }

    }

    public void dbSearch() {
        try {
            this.conn = jusolok.DBConn.dbConnection();
            this.stmt = this.conn.createStatement();
            String searchName = this.tfname.getText().trim();
            String searchTel = this.tftel.getText().trim();
            String searchCom = this.tfcom.getText().trim();
            String searchSql = "";
            if (!searchName.isEmpty()) {
                searchSql = "select * from addrtbl where name = '" + searchName + "';";
            } else if (!searchTel.isEmpty()) {
                searchSql = "select * from addrtbl where tel = '" + searchTel + "';";
            } else if (!searchCom.isEmpty()) {
                searchSql = "select * from addrtbl where com = '" + searchCom + "';";
            }

            System.out.println("검색 완료");
            this.rs = this.stmt.executeQuery(searchSql);
            String line = "";
            System.out.println("      이름         전화번호           회사이름\n");
            System.out.println("------------------------------------------------------\n");

            while(this.rs.next()) {
                String name = this.rs.getString("name");
                String tel = this.rs.getString("tel");
                String com = this.rs.getString("com");
                line = " | " + name + " | " + tel + " | " + com + "\n";
                System.out.println("rs => " + line);
            }

            this.stmt.close();
            this.conn.close();
        } catch (Exception var9) {
            var9.printStackTrace();
            System.err.println("검색 에러");
        }

    }

    public void dbUpdate() {
        try {
            this.conn = jusolok.DBConn.dbConnection();
            this.stmt = this.conn.createStatement();
            String in_name = this.tfname.getText().toString();
            String in_tel = this.tftel.getText().toString();
            String in_com = this.tfcom.getText().toString();
            this.stmt.executeUpdate("update addrtbl set tel = '" + in_tel + "', com = '" + in_com + "' where name = '" + in_name + "'");
            System.out.println(in_name + " 수정 완료");
            this.tfname.setText("");
            this.tftel.setText("");
            this.tfcom.setText("");
            this.stmt.close();
            this.conn.close();
        } catch (Exception var4) {
            var4.printStackTrace();
            System.err.println("수정 에러");
        }

    }

    public void dbDelete() {
        try {
            this.conn = jusolok.DBConn.dbConnection();
            this.stmt = this.conn.createStatement();
            String in_name = this.tfname.getText().toString();
            String sql = "delete from addrtbl where name = '" + in_name + "';";
            this.stmt.executeUpdate(sql);
            System.out.println("삭제 완료");
            this.tfname.setText("");
            this.tftel.setText("");
            this.tfcom.setText("");
            this.stmt.close();
            this.conn.close();
        } catch (Exception var3) {
            var3.printStackTrace();
            System.err.println("삭제 에러");
        }

    }

    public static void main(String[] args) {
        new jusolok();
    }

    public class DBConn {

        public static Connection dbConnection() {
            Connection conn = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studyDB", "root", "hmjeoung33");
            } catch (SQLException | ClassNotFoundException var2) {
                var2.printStackTrace();
                System.out.println("DB 연결 실패");
            }

            return conn;
        }
    }
}
