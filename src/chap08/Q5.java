package chap08;

import javax.swing.*;
import java.awt.*;

public class Q5 extends JFrame {
  public Q5(){
    setTitle("p.351 Q5");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container contentPane = getContentPane();

    contentPane.setLayout(new GridLayout(4,4));

    Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN
            , Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY
            , Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.GRAY, Color.PINK};

    for(int i = 0 ; i <16 ; i++){
      JButton button = new JButton(Integer.toString(i));
      button.setOpaque(true);
      button.setBackground(color[i]);
      contentPane.add(button);
    }

    setSize(500, 300);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Q5();
  }
}
