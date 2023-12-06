package sec03_1.chap01;

public class EqualsTest {
  public static void main(String[] args) {
    String a = "JAVA";
    String b = "JAVA";
    String c = new String("JAVA");
    String d = new String("JAVA");

    System.out.println( a == b );  // true
    System.out.println( b == c );  // false 주석값을 비교하게 되어 펄스뜸.
    System.out.println( c == d );  // false

    System.out.println( a.equals(b) );  // true
    System.out.println( b.equals(c) );  // true
    System.out.println( c.equals(d) );  // true
  }
}
