import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login2 extends JFrame {
    Login2(){
        setTitle("Login ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(5, 2);
        grid.setVgap(5);

        Container c = getContentPane();
        c.setLayout(grid);

        c.add(new JLabel(" 이름"));
        JTextField nametxt = new JTextField("");
        c.add(nametxt);
        c.add(new JLabel(" 학번"));
        JTextField stuidtxt = new JTextField("");
        c.add(stuidtxt);
        c.add(new JLabel(" 학과"));
        JTextField depttxt = new JTextField("");
        c.add(depttxt);
        c.add(new JLabel(" 과목"));
        JTextField objecttxt = new JTextField("");
        c.add(objecttxt);
        JButton ok = new JButton("확인");
        c.add(ok);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String name = nametxt.getText();
                String stuid = stuidtxt.getText();
                String dept = depttxt.getText();
                String object = objecttxt.getText();
                System.out.println(name + ", " + stuid + ", " + dept + ", " + object);
            }
        });

        JButton no =new JButton("취소");
        c.add(no);
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                nametxt.setText("");
                stuidtxt.setText("");
                depttxt.setText("");
                objecttxt.setText("");
            }
        });

        setSize(300, 200);
        setVisible(true);
    }
}