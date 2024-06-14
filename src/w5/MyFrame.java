import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        // 객체이름.method()
        this.setTitle("첫번째 프레임");
        // 프레임에서 x를 누르면 프레임 윈도우가 닫힘
        // 하지만 응용프로그램은 종료된 것이 아님
        // 프레임에서 X(종료버튼) 클릭 시 응용프로그램도 종료될 수 있도록 함.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);   // 단위 : 픽셀
        this.setVisible(true);
    }
    public static void main(String[] args){
        MyFrame fr1 = new MyFrame();
//        MyFrame fr2 = new MyFrame();
        new MyFrame();
    }
}
