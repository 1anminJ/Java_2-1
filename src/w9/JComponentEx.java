import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComponentEx extends JFrame {
    public JComponentEx() {
        super("JComponent의 공통 메소드 예제");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton b1 = new JButton("Magenta / Yellow Button");
        JButton b2 = new JButton("Disalbled Button");
        JButton b3 = new JButton("getX(), getY()");

        b1.setBackground(Color.YELLOW);     // 배경색 설정
        b1.setForeground(Color.MAGENTA);    // 폰트색 설정
        b1.setFont(new Font("Arial", Font.ITALIC, 20)); // Arial, 20픽셀 폰트 설정
        b2.setEnabled(false);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                JComponentEx frame = (JComponentEx) b.getTopLevelAncestor();
                frame.setTitle(b.getX() + ", " + b.getY());     // 타이틀에 버튼 좌표 출력
            }
        });
        // 컨텐트팬에 버튼 부착
        c.add(b1);
        c.add(b2);
        c.add(b3);
        setSize(260, 200);
        setVisible(true);
    }
}
