package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex02 extends JFrame {
  public Ex02(){
    setTitle("p.385 실습문제 2번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.addKeyListener(new MyKeyListener());

    c.setLayout(null);
    c.setBackground(Color.CYAN);

    setSize(300,200);
    setVisible(true);

    c.setFocusable(true);
    c.requestFocus();
  }

  class MyKeyListener implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
      if (e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
        getContentPane().setBackground(Color.RED);
      }
    }

    @Override
    public void keyReleased(KeyEvent e) {
      if (e.getKeyChar() == 'r' || e.getKeyChar() == 'R') {
        getContentPane().setBackground(Color.CYAN);
      }

    }
  }

  public static void main(String[] args) {
    new Ex02();
  }
}
