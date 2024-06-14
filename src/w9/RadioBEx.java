import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioBEx extends JFrame {
    private JRadioButton[] radio = new JRadioButton[3];
    private String[] text = {"사과", "배", "체리"};
    private ImageIcon[] image ={
            new ImageIcon("/Users/hanminjeong/Desktop/InteliJ_Java/proj0502/src/image/apple.png"),
            new ImageIcon("/Users/hanminjeong/Desktop/InteliJ_Java/proj0502/src/image/bae.jpeg"),
            new ImageIcon("/Users/hanminjeong/Desktop/InteliJ_Java/proj0502/src/image/cherry.jpeg")
    };
    private JLabel imageLabel = new JLabel();
    public RadioBEx(){
        this.setTitle("라디오 버튼 Item Event 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel radioPanel = new JPanel();
        radioPanel.setBackground(Color.GRAY);
        ButtonGroup g = new ButtonGroup();
        for(int i = 0; i < radio.length; i++){
            radio[i] = new JRadioButton(text[i]);
            g.add(radio[i]);
            radioPanel.add(radio[i]);
            radio[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(radio[0].isSelected())
                        imageLabel.setIcon(image[0]);
                    else if (radio[1].isSelected())
                        imageLabel.setIcon(image[1]);
                    else
                        imageLabel.setIcon(image[2]);
                }
            });
        }
        radio[2].setSelected((true));
        c.add(radioPanel, BorderLayout.NORTH);
        c.add(imageLabel, BorderLayout.CENTER);
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

        setSize(250, 200);
        setVisible(true);
    }

}
