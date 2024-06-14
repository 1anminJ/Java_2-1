package w9;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    LabelEx() {
        this.setTitle("레이블 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = this.getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel txtLabel = new JLabel("사랑합니다. 여러분~~~");
        ImageIcon beauty = new ImageIcon("/Users/hanminjeong/Desktop/InteliJ_Java/proj0502/src/image/image.jpeg");
        JLabel imageLabel = new JLabel(beauty);

        cp.add(txtLabel);
        cp.add(imageLabel);

        this.setSize(400, 600);
        this.setVisible(true);
    }
}
