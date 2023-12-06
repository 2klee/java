package sec03_1.chap02;

public class CirclaArea {
  public static void main(String[] args) {
    final double PI = 3.14;
    double radious = 10.2;
    double circleArea = radious*radious*PI;

    System.out.print("반지름 " + radious + "이고 ");
    System.out.println("원의 면적 = " + circleArea + "입니다.");
  }
}
