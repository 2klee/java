package Exam.chap05;

class NameCircle extends Circle {


  public NameCircle(int radious, String name) {
    super();
  }

  void show(){
    System.out.println(", 반지름 = " + getRadious());
  }


  public static void main(String[] args) {
    NameCircle w = new NameCircle(5,"와플");
    w.show();
  }
}
