package sec03_1.chap02;

import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("1~99 까지의 숫자 중 하나 입력해 주세요.");
    int number = scanner.nextInt();
    int first = number/10;
    int second = number%10;

    int a = 0;
    int b = 0;

    if (number > 0 && number < 100){
      if (first == 3 || first == 6 || first == 9 ){
        a = 1;
      }

      if (second == 3 || second == 6 || second == 9 ){
        b = 1;
      }

      int c = a + b;

      if(c == 1){
        System.out.println("박수짝!");
      }
      else if (c == 2){
        System.out.println("박수짝짝!");
      }
      else System.out.println("박수없음");
    }else System.out.println("1~99 까지의 숫자 다시 입력해 주세요.");



  scanner.close();
  }
};