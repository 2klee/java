package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ExQ02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("문장을 입력해주세요 >> ");

      String str = sc.nextLine();

      if(str.equals("exit")){
        System.out.println("종료합니다.");
        break;
      }

      StringTokenizer st = new StringTokenizer(str, " ");
      int n = st.countTokens();

      System.out.println("어절 개수는 " + n);


    }
  }
}
