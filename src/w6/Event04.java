package w6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Event04 extends JFrame {
    Event04(){
        this.setTitle("익명클래스 리스너 작성");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        JButton btn1 = new JButton("빨강");
        cp.add(btn1);
        JButton btn2 = new JButton("초록");
        cp.add(btn2);
        JButton btn3 = new JButton("노랑");
        cp.add(btn3);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                cp.setBackground(Color.RED);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                cp.setBackground(Color.GREEN);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                cp.setBackground(Color.YELLOW);
            }
        });

        this.setSize(350, 150);
        this.setVisible(true);
    }
}