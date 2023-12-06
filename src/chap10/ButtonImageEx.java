package chap10;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {
  public ButtonImageEx(){
    super("이미지 버튼 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());

    ImageIcon normalIcon = new ImageIcon("src/chap10/imgs/normalIcon.gif");
    ImageIcon rolloverIcon = new ImageIcon("src/chap10/imgs/rolloverIcon.gif");
    ImageIcon pressedIcon = new ImageIcon("src/chap10/imgs/pressedIcon.gif");

    JButton btn = new JButton("call~~", normalIcon);
    btn.setPressedIcon(pressedIcon);
    btn.setRolloverIcon(rolloverIcon);
    c.add(btn);

    setSize(250,150);
    setVisible(true);
  }

  public static void main(String[] args) {
    new ButtonImageEx();
  }

}
