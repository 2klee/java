package Exam.chap07;

import java.util.HashMap;
import java.util.Scanner;

public class CoffeeHashMap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<String, Integer> map = new HashMap<String, Integer>();

    map.put("에스프레소", 2000);
    map.put("아메리카노", 2500);
    map.put("카푸치노", 3000);
    map.put("카페라떼", 3500);


    System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼, 뭐 먹을래?");

    while (true) {
      System.out.print("주문 > ");
      String coffee = sc.next();
      if (coffee.equals("그만")) {
        System.out.println("그만합니다.");
        break;
      }
      Integer price = map.get(coffee);

      System.out.println(coffee + "는 " + price + "원 입니다.");
    }
  }
}
