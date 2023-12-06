package chap08;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
  public MainFrame(String title){
    super(title);
    final MainPanel mainPanel = new MainPanel();

    // 창에 컴포넌트(Button, Input, Label ...) 들을 붙이기 위함
    setLayout(new BorderLayout());

//    JPanel panel = new JPanel(); // JPanel 생성
//    panel.setBackground(Color.BLACK); // 배경색
    add(new ToolBar(mainPanel), BorderLayout.NORTH);

    add(mainPanel, BorderLayout.CENTER); // main 프레임에 붙이기(중앙에 위치)



    setSize(800,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }


}
