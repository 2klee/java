package sec03_1.chap03;

public class Ex05 {
  public static void main(String[] args) {

    String str1 = "이거 어디까지 올라가는 거에요?";

    //  💡 charAt : ~번째 문자 반환
    char ch1 = str1.charAt(0);
    char ch2 = str1.charAt(4);

    //  ⭐️ 마지막 문자 얻기
    char ch3 = str1.charAt(str1.length() - 1);
  }


}

