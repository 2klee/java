package chap03;

import java.util.Scanner;

public class ExQ05 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("정수 10개를 입력하세요");
    int[] a = new int[10];

    int[] temp;
    for (int i = 0; i < 10; i++) {
      a[i] = sc.nextInt();
      temp = new int[0];
      if (a[i] > a[i + 1]) {
        temp[i] = a[i + 1];
        temp[i + 1] = a[i];
      } else if (a[i] <= a[i + 1]) {
        temp[i] = a[i];
        temp[i + 1] = a[i + 1];
      }

    }
    System.out.println();

  }
}
