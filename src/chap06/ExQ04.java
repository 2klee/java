package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ExQ04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("덧셈식을 입력해 주세요.");
    String str = scanner.nextLine();
    StringTokenizer st = new StringTokenizer(str, "+");

    int sum = 0;

    while (st.hasMoreTokens()){
      String token = st.nextToken();
      int n = Integer.parseInt(token.trim());
      sum += n;
    }

    System.out.println("합은 " + sum);

  }
}
