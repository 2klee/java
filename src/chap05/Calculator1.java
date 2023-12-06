package chap05;

import java.util.Scanner;

abstract class Calculator1 {
  protected int a, b;

  // 추상 매소드
  abstract protected int calc();

  // 입력받는 매소드
  protected void input(){
    Scanner sc = new Scanner(System.in);
    System.out.print("정수 2개를 입력하세요 >> ");
    a = sc.nextInt();
    b = sc.nextInt();
  }
  public void run(){ // run 매소드는
    input(); // input 매소드를 실행한 후
    int res = calc(); // 결과값을 calc 매소드로 받은 뒤
    System.out.println("계산된 값은 " + res); // 출력
  }
}

class Adder extends Calculator1 {
  @Override
  protected int calc() {
    return a + b;
  }
}

class Subtracter extends Calculator1{

  @Override
  protected int calc() {
    return a - b;
  }
}


class App {
  public static void main(String[] args) {
    Adder adder = new Adder();
    Subtracter sub = new Subtracter();

    adder.run();
    sub.run();
  }
}
