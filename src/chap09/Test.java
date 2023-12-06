package chap09;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class Test {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Mouse Click Example");
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();

    panel.addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        int button = e.getButton();

        System.out.println("Mouse Clicked at (" + x + ", " + y + ") with Button: " + button);
      }

      @Override
      public void mousePressed(MouseEvent e) {
        // 필요에 따라 구현
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        // 필요에 따라 구현
      }

      @Override
      public void mouseEntered(MouseEvent e) {
        // 필요에 따라 구현
      }

      @Override
      public void mouseExited(MouseEvent e) {
        // 필요에 따라 구현
      }
    });

    frame.add(panel);
    frame.setVisible(true);
  }
}

