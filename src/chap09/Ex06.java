package chap09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ex06 extends JFrame {
    private JLabel[] la = new JLabel[12];
  public Ex06(){
    setTitle("p387 6번");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();

    c.setLayout(new GridLayout(4,3));

    for(int i = 0 ; i <12 ; i++){
      la[i] = new JLabel(Integer.toString(i));
      la[i].setBackground(Color.white);

      c.add(la[i]);
      la[i].addMouseListener(new MouseAdapter() {

        @Override
        public void mouseClicked(MouseEvent e) {
          JLabel la = (JLabel) e.getSource();
//          super.mouseClicked(e);
          int r = (int)(Math.random()*256);
          int g = (int)(Math.random()*256);
          int b = (int)(Math.random()*256);

          la.setOpaque(true);
          la.setBackground(new Color(r,g,b));
        }
      });
    }

    this.setSize(300, 200);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new Ex06();
  }
}
