//package chap13;
//
//class Outter2 {
//  int Num = 100;
//
//    return new
//
//  Runnable() {//  익명 내부 클래스
//    //MyRunnable 클래스 이름을 빼고
//    // 클래스를 생성하는 방법
//
//    public void run () {
////        num = 200; // 오류발생
////        i = 10;
//    }
//  }; // 클래스 끝에 ;를 씀
//
//
//
//
//  //익명 내부 클래스를 변수에 대입
//  //인터페이스나 추상 클래스형 변수르 선언하고 클래스를
//  //생성해 대입하는 방법
//  Runnable runner = new Runnable() {
//    //익명 내부클래스를 변수에 대입
//    @Override
//    public void run() {
//      System.out.println("Runnable이 구현된 익명 클래스");
//    }
//
//    ; // 클래스 끝에 ;를 씀
//  }
//}
//
//public class AnonymousInneerTest {
//  public static void main(String[] args) {
//    Outter2 out = new Outter2();
//    Runnable runnable = out.getRunnable(10);
//    runnable.run();
//    out.runner.run();
//  }
//}
