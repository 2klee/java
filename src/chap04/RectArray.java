//package sec03.chap04;
//
//import java.util.Scanner;
//
//class Rect {
//  private int width, height;
//  public Rect(int width, int height){
//    this.width = width;
//    this.height =  height;
//  }
//  public int getArea(){
//    return width*height;
//  }
//}
//
//public class RectArray {
//  public static void main(String[] args) {
//
//
//
//    Scanner sc = new Scanner(System.in);
//
//    Rect[] r = new Rect[4];
//
//    for(int i=0; i < r.length; i++){
//      System.out.print(i+1 + " 너비와 높이 >> ");
//      int width = sc.nextInt();
//      int height = sc.nextInt();
//      r[i] = new Rect(width, height);
//    }
//
//    for(int i=1; i < r.length; i++){
//      int sum
//    }
//
//
//
////
//    System.out.println("저장하였습니다...");
//    System.out.println("사각형의 전체 합은 " + r[1].getArea());
//
//  }
//}
//
//
//
//
//
////  Rect one = new Rect(3, 5) ;
////    Rect two = new Rect(3, 9) ;
////    Rect three = new Rect(2, 7) ;
////    Rect four = new Rect(9, 5) ;
//
////    int oneRect = one.getArea();
////    int twoRect = two.getArea();
////    int threeRect = three.getArea();
////    int fourRect = four.getArea();
//
////    int sumRect = oneRect + twoRect + threeRect + fourRect;
//
//
////    System.out.println("1 너비와 높이 >> " + one.width + " " + one.height);
////    System.out.println("2 너비와 높이 >> " + two.width + " " + two.height);
////    System.out.println("3 너비와 높이 >> " + three.width + " " + three.height);
////    System.out.println("4 너비와 높이 >> " + four.width + " " + four.height);