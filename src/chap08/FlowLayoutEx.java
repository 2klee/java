package chap08;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
  public FlowLayoutEx(){
    setTitle("FlowLayout 예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 클로즈 시 종료
    Container contentPane = getContentPane(); // 컨텐트팬 알아내기

    // 왼쪽 정렬로, 수평간격을 30, 수직간격을 40 픽셀로 배치하는 FlowLayout 생성
    contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

    contentPane.add(new JButton("add"));
    contentPane.add(new JButton("sub"));
    contentPane.add(new JButton("mul"));
    contentPane.add(new JButton("div"));
    contentPane.add(new JButton("Calculate"));

    setSize(300, 200); // 프레임 크기 설정
    setVisible(true); // 화면에 프레임 출력
  }

  public static void main(String[] args) {
    new FlowLayoutEx();
  }

}
