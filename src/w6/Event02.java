import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Event02 extends JFrame {
    Event02(){
        this.setTitle("내부클래스 이벤트 예제 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());
        JButton btn = new JButton("영어 Action");
        cp.add(btn);
        ActionInner lis = new ActionInner();
        btn.addActionListener(lis);

        this.setSize(350, 150);
        this.setVisible(true);
    }

    //-------안에 클래스 생성
    class ActionInner implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JButton b = (JButton) e.getSource();
            if(b.getText().equals("영어 Action"))
                b.setText("한글 액션");
            else
                b.setText("영어 Action");
        }
    }
}