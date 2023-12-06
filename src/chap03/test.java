package chap03;

import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    int[] sourceArray = {1, 2, 3, 4, 5};
    int[] destinationArray = sourceArray.clone();

    System.out.println("Copied Array: " + Arrays.toString(destinationArray));
  }
}
