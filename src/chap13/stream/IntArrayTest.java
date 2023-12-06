package chap13.stream;

import java.util.Arrays;

public class IntArrayTest {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};

    // 합계 반환
    int sumVal = Arrays.stream(arr).sum();
    // 배열의 요소 개수 반환
    int cnt = (int)Arrays.stream(arr).count();

    System.out.println(Arrays.stream(arr).reduce(0,(a,b) -> a+b));
                              // 초기값, 요소

  }
}
