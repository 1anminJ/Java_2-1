package w11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaEx2 extends JFrame {
    LambdaEx2(){
        this.setTitle("람다 예제 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());

        JLabel lb = new JLabel("아이스크림을 좋아하나요?");
        JButton btnOK = new JButton("예");
        JButton btnNO = new JButton("아니오");
        JButton btnSO = new JButton("중간");

        c.add(lb); c.add(btnOK); c.add(btnNO); c.add(btnSO);

//        btnOK.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("예, 아이스크림 좋아합니다.");
//            }
//        });
        btnOK.addActionListener((e) -> System.out.println("예, 아이스크림 좋아합니다."));
        btnNO.addActionListener((ActionEvent e) -> {
            System.out.println("아니오, 좋아하지 않습니다.");
        });
        btnSO.addActionListener((e)->System.out.println("좋아하지도 싫어하지도 않습니다."));

        this.setSize(300, 100);
        this.setVisible(true);
    }
}
