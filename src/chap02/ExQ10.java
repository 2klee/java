package chap02;

public class ExQ10 {
  public static void main(String[] args) {
    int i = 1;
//    if(i == 1) System.out.println("!");
//    else if (i == 2) System.out.println("@");
//    else if (i == 3) System.out.println("#");
//    else System.out.println("*");
    switch (i){
      case 1 : System.out.println("!"); break;
      case 2 : System.out.println("@"); break;
      case 3 : System.out.println("#"); break;
      default : System.out.println("*"); break;
    }
  }
}
