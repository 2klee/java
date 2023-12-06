package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex03 extends JFrame{
  public Ex03(){

    setTitle("p.386 실습문제 3번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.addMouseMotionListener(new MyMouseMotionListener());

    c.setLayout(null);
    c.setBackground(Color.GREEN);

    setSize(300,200);
    setVisible(true);
//
//    c.setFocusable(true);
//    c.requestFocus();
  }

  class MyMouseMotionListener implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        getContentPane().setBackground(Color.YELLOW);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      getContentPane().setBackground(Color.GREEN);

    }
  }

  public static void main(String[] args) {
    new Ex03();
  }

}


