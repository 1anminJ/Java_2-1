package w7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameEx extends JFrame {
    // 필드
    int rndNum;
    GameEx(){
        this.setTitle("숫자 게임");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // pn1
        JPanel pn1 = new JPanel();
        JLabel lbIn1 = new JLabel("숫자를 추측하시오");
        JTextField txtInput = new JTextField(10);
        pn1.add(lbIn1);
        pn1.add(txtInput);
        // pn2
        JPanel pn2 = new JPanel();
        JLabel lbResult = new JLabel("숫자를 입력하시오. (1 ~ 100)");
        pn2.add(lbResult);
        // pn3
        JPanel pn3 = new JPanel();
        JButton btn1 = new JButton("확인");
        JButton btn2 = new JButton("취소");
        pn3.add(btn1);
        pn3.add(btn2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strInput = txtInput.getText();
                int intInput = Integer.parseInt(strInput);
                if (rndNum == intInput){
                    System.out.println("축하합니다. 정답입니다.");
                    lbResult.setText("축하합니다. 정답입니다.");
                } else if(rndNum <= intInput){
                    System.out.println("숫자가 너무 큽니다. 다시 입력하십시오.");
                    lbResult.setText("숫자가 너무 큽니다. 다시 입력하십시오.");
                } else {
                    System.out.println("숫자가 너무 작습니다. 다시 입력하십시오.");
                    lbResult.setText("숫자가 너무 작습니다. 다시 입력하십시오.");
                }
            }
        });

        this.add(pn1, BorderLayout.NORTH);
        this.add(pn2, BorderLayout.CENTER);
        this.add(pn3, BorderLayout.SOUTH);

        this.setRandomNum();
        this.setSize(300, 200);
        this.setVisible(true);
    }
    public void setRandomNum(){
        // 여기서 int rndNum을 하면 setRandomNum()의 안에서만 실행이 되기에 6번 줄에 선언함
         rndNum = (int)(Math.random() * 100) + 1;
        System.out.println("정답은 : " + rndNum);
        // Math.random() 함수는 0.0 ~ 1.0 사이의 랜덤한 값을 반환(double 타입)
        // 그래서 100을 곱하고 1을 더하여 최대를 100으로 만들어 줌
    }
}
