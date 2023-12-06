package chap03;

public class Ex03 {
  public static void main(String[] args) {
    char a = 'a';

    do {
      System.out.println(a);
      a=(char)(a+1);
    } while (a <= 'z');
  }
};