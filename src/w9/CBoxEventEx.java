package w9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CBoxEventEx extends JFrame {
//    private JCheckBox[] fruits = new JCheckBox[3];
    private String[] names = {"사과", "배", "체리"};
    private int [] prices = {100, 500, 20000};
    int sum = 0;
    JLabel sumLable;
    CBoxEventEx(){
        this.setTitle("체크박스 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());

        cp.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
        JCheckBox apCbox = new JCheckBox(names[0]);
        JCheckBox baeCbox = new JCheckBox(names[1]);
        JCheckBox cherryCbox = new JCheckBox(names[2]);

        apCbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (apCbox.isSelected())
                    sum = sum + prices[0];
                else
                    sum = sum - prices[0];
                sumLable.setText("현재 " + sum + "원 입니다.");
            }
        });

        baeCbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (baeCbox.isSelected())
                    sum = sum + prices[1];
                else
                    sum = sum - prices[1];
                sumLable.setText("현재 " + sum + "원 입니다.");
            }
        });

        cherryCbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cherryCbox.isSelected())
                    sum = sum + prices[2];
                else
                    sum = sum - prices[2];
                sumLable.setText("현재 " + sum + "원 입니다.");
            }
        });
        cp.add(apCbox);
        cp.add(baeCbox);
        cp.add(cherryCbox);

        sumLable = new JLabel("현재 0원 입니다.");
        cp.add(sumLable);

        this.setSize(250, 200);
        this.setVisible(true);
    }
}
