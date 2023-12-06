import java.util.Random;

public class Equals {
  public static void main(String[] args) {

    Random rd = new Random();

    int a = rd.nextInt(3);
    int b = rd.nextInt(3);
    int c = rd.nextInt(3);

    while ((!(a == b && b == c))) {

      a = rd.nextInt(3) + 1;
      b = rd.nextInt(3) + 1;
      c = rd.nextInt(3) + 1;

      System.out.println(a + "  " + b + "  " + c);
    }
    System.out.println("성공");
  }
}
