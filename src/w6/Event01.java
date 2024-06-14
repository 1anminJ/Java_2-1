package w6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Event01 extends JFrame {
    Event01(){
        this.setTitle("독립클래스 이벤트 예제 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        JButton btn = new JButton("영어 Action");
        cp.add(btn);
        MyAction lis = new MyAction();
        btn.addActionListener(lis);

        this.setSize(350, 150);
        this.setVisible(true);
    }
}

//------------------------------------------

class MyAction implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // 처리해야 하는 루틴
//		System.out.println("영어 Action 버튼이 클릭됨~");
        System.out.println(e);
        JButton b = (JButton) e.getSource();
        if(b.getText().equals("영어 Action"))
            b.setText("한글 액션");
        else
            b.setText("영어 Action");
    }
}