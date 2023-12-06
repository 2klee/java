package chap05;

public interface RemoteControl {

  // 인터페이스 맴버 종류

  // 인터페이스에서 선언된 필드는 모두 public static final 의 특성을 가지고 있음
  // public 상수 필드
  // 타입 변수명 = 값;

  // 상수는 대문자로 작성, 단어 사이에는 _를 사용하는 것이 관례다

  int MAX_VOLUME = 10;

  int MIN_VOLUME = 0;


  // public 상수 필드
  // public 추상 매소드
  // 인터페이스 추상매소드는 기본적으로 public 접근 제한을 받기 때문에
  // 구현클래스에서 재정의 되는 매소드는 항상 public 접근 지정자를 갖는다.

  void turnOn();
  void turnoff();
  void  setVolume(int volume);

  // public 디폴트 매소드
  // 완전한 실행 코드를 가지는 디폴트 매소드를 선언할 수 있다.
  public default void setMute(boolean mute){
    if(mute){
      System.out.println("무음 처리 합니다.");
    } else {
      System.out.println("무음 해제 합니다.");
    }
  }


  // public 정적 매소드

  // private 매소드
  // private 정적 매소드

}
