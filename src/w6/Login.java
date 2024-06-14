import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame {
    Login(){
        this.setTitle("LOGIN");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(3, 2);
        grid.setVgap(5);

        Container cp = this.getContentPane();
        cp.setLayout(grid);

        cp.add(new JLabel(" 이메일"));
        JTextField emailtxt = new JTextField();
        cp.add(emailtxt);
        cp.add(new JLabel(" 비밀번호"));
        JPasswordField pw = new JPasswordField();
        cp.add(pw);

        JButton loginbt = new JButton("Login");
        cp.add(loginbt);
        //이벤트 등록
        loginbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String email = emailtxt.getText();
                String pass = pw.getText();
                System.out.println("로그인 클릭 : " + email + ", " + pass);
            }
        });

        JButton cancelbt = new JButton("취소");
        cp.add(cancelbt);
        cancelbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                emailtxt.setText("");
                pw.setText("");
            }
        });

        this.setSize(300, 150);
        this.setVisible(true);
    }
}
