package chap13;


class Outter{
  int outNum = 100;
  static int sOutNum = 200;

  Runnable getRunnable(int i){ //Runnable 인터페이스 구현하는
                              // 지역 내부클래스로 구현한 예제

    int num = 100;

    class MyRunnable implements Runnable{

      int localNum = 10;

      @Override
      public void run() {
        //num = 200; // 지역변수는 상수로 바뀜
        //i = 10; // 매개변수도 상수로 바뀜

        System.out.println("i :: " + i + " // num :: " + num);
        System.out.println("localNum :: " + localNum);
      }
    }
    return new MyRunnable(); // 지역내부 클래스이름은 클래스...
  }
}

public class LocalInnerTest {
  public static void main(String[] args) {
    Outter out = new Outter();
    Runnable runner = out.getRunnable(10); // apthem ghcnf
                                          // getRunnable 메소드 호출 끝남
    runner.run(); // run() 실행되면서 getRunnable() 메소드의 지역변수가 사용됨
  }
}
