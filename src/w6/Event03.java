import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Event03 extends JFrame {
    Event03(){
        this.setTitle("익명클래스 이벤트 예제 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        JButton btn = new JButton("영어 Action");
        cp.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JButton b = (JButton) e.getSource();
                if(b.getText().equals("영어 Action"))
                    b.setText("한글 액션");
                else
                    b.setText("영어 Action");
            }
        });

        this.setSize(350, 150);
        this.setVisible(true);
    }
}