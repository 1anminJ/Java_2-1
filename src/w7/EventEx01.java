package w7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx01 extends JFrame {
        EventEx01(){
            this.setTitle("이벤트 예제1");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            Container cp = this.getContentPane();
//            cp.setLayout(new FlowLayout());
            JPanel pn1 = new JPanel();
//            JLabel lbTxt = new JLabel("커피를 좋아하나요?");
            pn1.add(new JLabel("초콜렛을 좋아하나요?"));
            JButton btnyes = new JButton("Yes");
            JButton btnno = new JButton("No");

            btnyes.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("네, 초콜렛을 좋아합니다.");
                }
            });

            btnno.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("아니요, 초콜렛을 좋아하지 않습니다.");
                }
            });

            this.add(pn1);
            pn1.add(btnyes);
            pn1.add(btnno);
            this.setSize(350,150);
            this.setVisible(true);

        }
}
