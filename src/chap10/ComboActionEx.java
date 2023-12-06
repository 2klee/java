package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboActionEx extends JFrame {
  private String [] fruits = {"apple", "banana", "mango"};
  private ImageIcon [] images = {new ImageIcon("src/chap10/imgs/apple.jpg")
          , new ImageIcon("src/chap10/imgs/banana.jpg"), new ImageIcon("src/chap10/imgs/mango.jpg")};
  private JLabel imgLabel = new JLabel(images[0]);

  public ComboActionEx(){
    setTitle("콤보박스 활용 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    JComboBox<String> combo = new JComboBox<String>(fruits);
    c.add(combo); c.add(imgLabel);

    combo.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JComboBox<String> cb = (JComboBox<String>)e.getSource();

        int index = cb.getSelectedIndex();
        imgLabel.setIcon(images[index]);

      }
    });

        setSize(300,250);
        setVisible(true);
  }

  public static void main(String[] args) {
    new ComboActionEx();
  }

}
