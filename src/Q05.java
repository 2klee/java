//package QEx;

import java.util.Scanner;

public class Q05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("논리 연산을 입력하세요 >> ");
    Boolean a = sc.nextBoolean();
    String op = sc.next();
    Boolean b = sc.nextBoolean();

    switch (op){
      case "AND" :
        System.out.println(a&b);
        break;
      case "OR" :
        System.out.println(a||b);
        break;
    }
  }
}
