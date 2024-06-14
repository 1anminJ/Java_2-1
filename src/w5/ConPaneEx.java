import javax.swing.*;
import java.awt.*;

// 설계도
public class ConPaneEx extends JFrame {
   ConPaneEx(){
       this.setTitle("20230842 한민정");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       Container cp = this.getContentPane();
       cp.setBackground(Color.YELLOW);
       cp.setLayout(new FlowLayout());  // 버튼들이 겹치지 않게

       JButton btok = new JButton("OK");
       cp.add(btok);
       JButton btcancel = new JButton("Cancel");
       cp.add(btcancel);
       cp.add(new JButton("무시"));

       this.setSize(300, 150);
       this.setVisible(true);
   }
}
