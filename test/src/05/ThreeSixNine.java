import java.util.Scanner;
public class ThreeSixNine{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    String eng[] = { "student", "love", "java", "happy", "future" };
    String kor[] = { "학생", "사랑", "자바", "행복한", "미래" };
    String s = "";
    while(true)
    {
      int f = 0; //초기화
      System.out.print("영어 단어를  입력하세요 >> ");
      s = scan.next();
      if (s.equals("exit"))
      {
        System.out.println("프로그램 종료합니다.");
        break;
      }
      for (int i = 0; i < eng.length; i++)
      {
        if (s.equals(eng[i]))
        {
          System.out.println(kor[i]);
          f = 1;
          break;
        }
      }
      if (f==0)
      {
        System.out.println("그런 영어 단어가 없습니다.");
      }
    }
    scan.close();
  }
}