package chap05;

abstract class Animal {
  // 매소드 선언
  public void breathe(){
    System.out.println("숨을 쉰다");
  }

  // 추상매소드 선언
  public abstract void sound();
}

class Dog extends Animal {
  @Override
  public void sound(){
    System.out.println("멍멍");
  }

}
class Cat extends Animal {
  @Override
  public void sound(){
    System.out.println("야옹");
  }
}
public class AbstractExam {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.sound();

    Cat cat = new Cat();
    cat.sound();

    animalSound(new Dog());
    animalSound(new Cat());
  }

  public static void animalSound(Animal animal){
    animal.sound();
  }
}
