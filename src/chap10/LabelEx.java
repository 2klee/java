package chap10;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
  public LabelEx(){
    setTitle("레이블 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());

    JLabel textLabel = new JLabel("안녕하세요, 손흥민입니다.");

    ImageIcon img = new ImageIcon("src/chap10/imgs/son.jpg");
    JLabel imageLabel = new JLabel(img);
    imageLabel.setSize(300,200);

    ImageIcon icon = new ImageIcon("src/chap10/imgs/coys.jpg");
    icon = new ImageIcon(icon.getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
    JLabel label = new JLabel("토트넘 공식홈페이지",icon,SwingConstants.CENTER);


    c.add(textLabel);
    c.add(imageLabel);
    c.add(label);

    setSize(300,450);
    setVisible(true);
  }

  public static void main(String[] args) {
    new LabelEx();
  }
}
