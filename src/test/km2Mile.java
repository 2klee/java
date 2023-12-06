package test;


import java.util.Scanner;

class Converter{
  private int km = 0;

  public Converter() {
  }
}

class Km2Mile extends Converter {
  private static int b;
  double mile;
  public Km2Mile(double i) {
    mile = b/i ;
  }
  public void run() {
    System.out.println("변환 결과 : " + mile +  "mile 입니다.");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Km2Mile toMile = new Km2Mile(1.6);

    System.out.println("km을 mile로 바꿉니다.");
    System.out.println("km을 입력하세요 >> ");
    km = sc.nextInt();

    toMile.run();
  }
}