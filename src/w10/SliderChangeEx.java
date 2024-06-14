package w10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SliderChangeEx extends JFrame {
    private JLabel colorLable;
    private JSlider [] sl = new JSlider[3];
    public SliderChangeEx(){
        setTitle("슬라이더와 ChangeEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        colorLable = new JLabel("         SLIDER EXAMPLE         ");
        for(int i = 0; i < sl.length; i++){
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
            sl[i].setPaintLabels(true);
            sl[i].setPaintTicks(true);
            sl[i].setPaintTrack(true);
            sl[i].setMajorTickSpacing(50);
            sl[i].setMinorTickSpacing(10);
            c.add(sl[i]);
        }
        sl[0].setForeground(Color.RED);
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);

        int r = sl[0].getValue();
        int g = sl[1].getValue();
        int b = sl[2].getValue();

        colorLable.setOpaque(true);
        colorLable.setBackground((new Color(r, g, b)));
        c.add(colorLable);

        JButton okbtn = new JButton("확인");
        JButton nobtn = new JButton("취소");
        okbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = sl[0].getValue();
                int g = sl[1].getValue();
                int b = sl[2].getValue();
                colorLable.setBackground(new Color(r, g, b));
            }
        });
        c.add(okbtn);
        c.add(nobtn);

        setSize(250, 270);
        setVisible(true);
    }


    public static void main(String[] args){
        new SliderChangeEx();
    }
}