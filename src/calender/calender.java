package sec03.calender;

import java.util.Scanner;

class calenderMake {
//  public final void set(int x) {
//
//  }
}

public class calender extends calenderMake {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int year = 0, month = 0;

    while (true) {
      System.out.print("연도를 입력하세요 : ");
      year = scanner.nextInt();

      if (year < 1 || year > 9999) {
        System.out.println("숫자는 1~9999 사이의 숫자만 입력가능합니다.");
        continue;
      }

      for(month = 1 ; month < 13 ; month++ ){
        System.out.println("  << "+month+" >>");
      }




    }


  }
}
