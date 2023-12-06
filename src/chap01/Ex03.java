package sec03_1.chap01;

public class Ex03 {
  public static void main(String[] args) {
//    int a = 1;
//    a = a + 2;
//
//
//    a += 3;
//
//    int b = a += 4;


//    int x = 3;
//    x += 2;
//    x -= 3;
//    x *= 12;
//    x /= 3;
//    x %= 5;


//    byte x = 127;
//    x += 1;
//
//
//    byte y = -128;
//    y -= 1;

    int int1 = 3;

    int int2 = int1++; // 🔴
    int int3 = ++int1;
    int int4 = -(int2-- * --int3);

    int x = 1;

    System.out.println(x++);
    System.out.println(++x);
    System.out.println(x);

  }
}
