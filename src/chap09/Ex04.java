package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex04 extends JFrame {

  private JLabel la = new JLabel("Love Java");
  public Ex04(){
    setTitle("p.286 실습문제 4번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();

    c.setLayout(new FlowLayout());
//    c.setBackground();

    la.setSize(100,50);
    la.setFont(new Font("Arial",Font.PLAIN, 10));
    la.setLocation(50,50);
    c.add(la);

    la.addKeyListener(new MyKeyListener());

    setSize(300,200);
    setVisible(true);

    la.setFocusable(true);
    la.requestFocus();
  }

  class MyKeyListener implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
      JLabel la = (JLabel)e.getSource();
      Font f = la.getFont();
      int size = f.getSize();
      if(e.getKeyChar() == '+'){
        la.setFont(new Font("Arial",Font.PLAIN,size+5));
      } else if (e.getKeyChar() == '-'){
        la.setFont(new Font("Arial",Font.PLAIN,size-5));
      }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
  }

  public static void main(String[] args) {
    new Ex04();
  }


}
