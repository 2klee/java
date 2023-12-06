//package chap12;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class CountingThreadExample {
//  private static JLabel countLabel;
//
//  public static void main(String[] args) {
//    SwingUtilities.invokeLater(() -> {
//      createAndShowGUI();
//      startCountingThread();
//    });
//  }
//
//  private static void createAndShowGUI() {
//    JFrame frame = new JFrame("Counting Thread Example");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//    countLabel = new JLabel("Count: 0");
//    countLabel.setFont(new Font("Arial", Font.BOLD, 18));
//
//    frame.add(countLabel);
//    frame.setSize(200, 100);
//    frame.setLocationRelativeTo(null);
//    frame.setVisible(true);
//  }
//
//  private static void startCountingThread() {
//    Thread countingThread = new Thread(() -> {
//      int count = 0;
//      while (true) {
//        try {
//          SwingUtilities.invokeAndWait(() -> updateCountLabel(count));
//          Thread.sleep(1000); // 1초 대기
//          count++;
//        } catch (Exception e) {
//          e.printStackTrace();
//        }
//      }
//    });
//
//    countingThread.start();
//  }
//
//  private static void updateCountLabel(int count) {
//    countLabel.setText("Count: " + count);
//  }
//}
