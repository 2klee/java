package sec03.chap04;

public class CatEx {

  public static void main(String[] args) {

    System.out.println(Cat.getCount());
    Cat cat1 = new  Cat("라일");
    System.out.println(Cat.getCount());
    Cat cat2 = new  Cat("라이");

    System.out.println(cat1);
    System.out.println(Cat.FOOD);

  }
}
