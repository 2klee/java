package chap05;

public class RemoteControlEx {
  public static void main(String[] args) {

//    rc 변수에 TV 객체를 대입
//    rc = new Television();
//    rc.turnOn();
//
//    // rc 변수에 Audio 객체를 대입 (교체)
//    rc = new Audio();
//    rc.turnOn();

    RemoteControl rc;

    rc = new Television();
    rc.turnOn();
    rc.setVolume(5);
    rc.setMute(true);
    rc.setMute(false);
    rc.setVolume(50);
    rc.turnoff();;



  }
}
