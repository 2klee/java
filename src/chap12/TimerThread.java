//package chap12;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class TimerThread extends Thread{
//  private JLabel timerLabel; // 타이머 값이 출력되는 레이블
//
//  public TimerThread(JLabel timerLabel){
//    this.timerLabel = timerLabel; // 타이머 카운트를 출력할 레이블
//  }
//
//  // 스레드 코드. run()이 종료하면 스레드 종료
//  @Override
//  public void run() {
//    int n=0; // 타이머 카운트 값
//    while (true){
//      timerLabel.setText(Integer.toString(n));
//      n++;
//      try{
//        Thread.sleep(1000); // 1초동안 잠을 잔다.
//      }
//      catch (InterruptedException e){
//        return; // 예외가 발생하면 스레드 종료
//      }
//    }
//  }
//}
//
//public class ThreadTimerEx extends JFrame{
//  public ThreadTimerEx(){
//    setTitle("Thread를 상속받은 타이머 스레드 예제");
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    Container c = getContentPane();
//
//    JLabel timer
//
//    c.add();
//    setSize(500,200);
//    setVisible(true);
//  }
//
//}