package sec03.chap03;

import java.util.Scanner;

public class ExQ08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String str[] = {"가위", "바위", "보"};

    int i;

    System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

    while(true)
    {
      int n = (int)(Math.random()*3); //0~2 중 랜덤 정수 리턴

      System.out.print("가위 바위 보!>>");

      String s = sc.next();
      if(s.equals("그만")) break;

      for (i = 0; i < str.length; i++) {
        if(s.equals(str[i])) break;
      }

      if(i == n) // 비긴 경우
      {
        System.out.println("사용자는 = "+str[i]+", 컴퓨터 = "+str[n]+", 비겼습니다.");
      }
      else if(i == 0 && n == 2 || i == 1 && n == 0 || i == 2 && n == 1) // 사용자가 이긴경우
      {
        System.out.println("사용자는 = "+str[i]+", 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
      }
      else// 컴퓨터가 이긴 경우
      {
        System.out.println("사용자는 = "+str[i]+", 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
      }
    }
    System.out.println("게임을 종료합니다...");

  }
}

