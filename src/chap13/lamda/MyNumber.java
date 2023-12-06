package chap13.lamda;

@FunctionalInterface // 람다식임을 알수있게 함.
public interface MyNumber {
  int getMax(int num1, int num2); // 추상메소드 선언
}
