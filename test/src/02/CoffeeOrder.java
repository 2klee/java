
import java.util.Scanner;

public class CoffeeOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("커피를 주문하세요 >> ");
    String coffee = sc.next();
    int x = sc.nextInt();
    int price;

    if ("에스프레소".equals(coffee)){
      int total = 2000 * x;
      System.out.println( total + "원 입니다.");
    }else if ("아메리카노".equals(coffee)){
      int total = 2500 * x;
      System.out.println( total + "원 입니다.");
    }else if ("카푸치노".equals(coffee)) {
      int total = 3000 * x;
      System.out.println( total + "원 입니다.");
    }else if ("카페라떼".equals(coffee)) {
      int total = 3500 * x;
      System.out.println( total + "원 입니다.");
    }
  }
}
