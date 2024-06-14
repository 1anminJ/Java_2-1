import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxEx extends JFrame {
    private String[] fruits = {"사과", "바나나", "키위", "망고", "배", "복숭아", "딸기", "블랙베리"};
    public ComboBoxEx(){
        this.setTitle("콤보박스 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JComboBox<String> strCombo = new JComboBox(fruits);
        c.add(strCombo);

        strCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(strCombo.getSelectedItem().toString());
                int index = strCombo.getSelectedIndex();
                System.out.println(fruits[index]);
            }
        });

        setSize(300, 300);
        setVisible(true);
    }
}
