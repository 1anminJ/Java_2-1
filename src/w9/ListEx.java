package w9;

import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
    private String[] fruits = {"사과", "바나나", "키위", "망고", "배", "복숭아", "딸기", "블랙베리"};
    public ListEx(){
        setTitle("리스트 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JList<String> strList = new JList<>(fruits);
        c.add(strList);

        setSize(300, 300);
        setVisible(true);
    }
}
