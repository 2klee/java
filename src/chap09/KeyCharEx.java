package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyCharEx extends JFrame {
  private JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");
  public KeyCharEx(){
    super("KeyListener의 문자 키 입력 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane(); // 컨텐트팬 알아내기
    c.setLayout(new FlowLayout());
    c.add(la);
    c.addKeyListener(new MyKeyListener()); // 키리스너 달기
    setSize(250,150);
    setVisible(true);

    c.setFocusable(true);
    c.requestFocus();
  }

  class MyKeyListener extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {
      int r = (int) (Math.random()*256);
      int g = (int) (Math.random()*256);
      int b = (int) (Math.random()*256);

      switch (e.getKeyChar()){
        case '\n':
          la.setText("r = " + r + "g = " + g + "b = " + b);
          getContentPane().setBackground(new Color(r,g,b));

          break;

        case 'q':System.exit(0);
      }
    }
  }

  public static void main(String[] args) {
    new KeyCharEx();
  }
}
