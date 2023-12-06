package chap13;

class OutClass{ // 외부 클래스
  private int num = 10; // 외부 클래스 private 변수
  private static int sNum = 20; // 외부 클래스의 정적 변수

  private InClass inClass; // 내부클래스의 자료형 변수를 선언

  public OutClass(){          // 외부 클래스의 디폴트 생성자
    inClass = new InClass(); // 외부 클래스가 생성된 뒤에
                              // 내부클래스 생성 가능

  }
  class InClass { // 인스턴스 내부 클래스
    int inNum = 10; // 내부클래스의 변수
//    static int sInnum = 200; // 내부 클래스에서는 정적변수 선언불가

    void inTest(){
      System.out.println("OutClass num : " + num + "외부 클래스의 인스턴스 변수");
      System.out.println("OutClass sNum : " + sNum + "외부 클래스의 정적 변수");
    }

    static void test(){ //정적 메소드 정의 불가능
      System.out.println("1");
    }
  }
  public void usingClass(){
    inClass.inTest();
  }

  // 정적 내부 클래스
  static class InStaticClass{     // 정적 내부 클래스
    int inNum = 100;            //정적 내부 클래스의 인스턴스 변수
    static int sInNum = 200;    // 정적 내부 클래스의 정적 변수

    void inTest(){ // 정적 내부 클래스의 이란 메서드
      //num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없다.
      System.out.println(inNum + "정적 내부클래스의 인스턴스 변수 사용");
      System.out.println(sInNum + "정적 내부클랫의 정적 변수사용");
      System.out.println(sNum + "외부 클래스의 인스턴스 변수사용");
    }

    static void sTest(){ //정적 내부 클래스의 정적 메소드
//      num += 10 ; // 외부 클래스의 인스턴스 변수 사용X
//      inNum += 10 ; // 내부 클래스의 인스턴스 변수 사용X

      System.out.println(sNum + "외부클래스의 정적 변수 사용");
      System.out.println(sInNum + "내부클래스의 정적 변수 사용");

    }

  }
}

public class InnerTest {
  public static void main(String[] args) {
    // 외부 클래스를 생성하지 않고 내부 클래스 생성
    OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
    // 정적 내부 클래스의 일반 메소드 호출
    sInClass.inTest();

    System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
    OutClass.InStaticClass.sTest();

    OutClass outClass = new OutClass();
    System.out.println("외부 클래스를 이용해 내부클래스 기능 호출");
    outClass.usingClass(); // 내부 클래스 기능 호출

  }
}
