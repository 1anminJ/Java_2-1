package w7;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx02 extends JFrame {
    EventEx02(){
        this.setTitle("이벤트 예제 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            Container cp = this.getContentPane();
//            cp.setLayout(new FlowLayout());

        JPanel pn1 = new JPanel();
        JButton btnRed = new JButton("빨간색");
        pn1.add(btnRed);
        JButton btnGreen = new JButton("초록색");
        pn1.add(btnGreen);
        JButton btnYellow = new JButton("노란색");
        pn1.add(btnYellow);

        JPanel pn2 = new JPanel();
        JLabel lbInfo = new JLabel("안내 : 버튼을 클릭하시오. ");
        pn2.add(lbInfo);
        // 판넬 2개 생성 완료
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn1.setBackground(Color.RED);
                pn2.setBackground(Color.RED);
                lbInfo.setText("빨간색 버튼을 클릭했어요.");
                System.out.println("빨간색 버튼을 클릭했어요.");
            }
        });
        btnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn1.setBackground(Color.GREEN);
                pn2.setBackground(Color.GREEN);
                lbInfo.setText("초록색 버튼을 클릭했어요.");
                System.out.println("초록색 버튼을 클릭했어요.");

            }
        });
        btnYellow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn1.setBackground(Color.YELLOW);
                pn2.setBackground(Color.YELLOW);
                lbInfo.setText("노란색 버튼을 클릭했어요.");
                System.out.println("노란색 버튼을 클릭했어요.");
            }
        });

//        this.add(pnMain);
        this.add(pn1, BorderLayout.NORTH);
        this.add(pn2, BorderLayout.CENTER);
        this.setSize(350,105);
        this.setVisible(true);
    }
}
