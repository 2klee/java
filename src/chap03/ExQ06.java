package sec03.chap03;

import java.util.Scanner;

public class ExQ06 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    /* 챗gpt로 작성 */

    String eng[] = {"student","love","java","happy","future"};
    String kor[] = {"학생","사랑","자바","행복한","미래"};


    while (true) {
      System.out.print("영어 단어를 입력하세요 (exit로 종료): ");
      String input = scanner.nextLine().toLowerCase(); // 입력받은 문자를 input에 저장

      if (input.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }

      int index = -1;

      // 입력한 단어가 배열 eng 에 있는지 확인
      for (int i = 0; i < eng.length; i++) {
        if (eng[i].equals(input)) {
          index = i;
          break;
        }
      }

      if (index != -1) {
        // 번역된 한글 단어 출력
        System.out.println("한글: " + kor[index]);
      } else {
        System.out.println("해당 영어 단어를 찾을 수 없습니다.");
      }
    }


  }
}
