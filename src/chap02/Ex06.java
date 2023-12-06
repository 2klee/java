package sec03_1.chap02;

import java.util.Scanner;

public class Ex06 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("돈의 액수를 입려하세요 >>>");
    int money = scanner.nextInt();

    int a = money / 50000;
    int b = (money - 50000 * a) / 10000;
    int c = (money - 50000 * a - 10000 * b) / 1000;
    int d = (money - 50000 * a - 10000 * b - 1000 * c) / 500;
    int e = (money - 50000 * a - 10000 * b - 1000 * c - 500 * d) / 100;

//    int a = money / 50000;
//    money =  money % 50000;
//    int b =
//    money =  money %
//    int c =
//    money =  money %
//    int d =
//    money =  money %
//    int e =
//    money =  money %


    if(a > 0){
      System.out.println("오만원" + a + "개");
    }

    if(b > 0){
      System.out.println("1만원" + b + "개");
    }

    if(c > 0){
      System.out.println("1천원" + c + "개");
    }

    if(d > 0){
      System.out.println("500원" + d + "개");
    }

    if(e > 0){
      System.out.println("100원" + e + "개");
    }

    else if(money <= 50){
      System.out.println("계산 할 수 없습니다.");
    }

    scanner.close();
  }

}
