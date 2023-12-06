package chap07;

import java.util.ArrayList;

public class DogTest {
  public static void main(String[] args) {
    ArrayList<Dog> dogs = new ArrayList<Dog>();

    dogs.add(new Dog("개1","치아와"));
    dogs.add(new Dog("개2","아와"));
    dogs.add(new Dog("개3","dhk"));
    dogs.add(new Dog("개4","fdsa"));
    dogs.add(new Dog("개5","fdsaa"));

    for(int i = 0 ; i < dogs.size() ; i++){
      System.out.println(dogs.get(i).showDogInfo());
    }
    System.out.println("===============");
    for (Dog dog : dogs){
      System.out.println(dog.showDogInfo());
    }
  }
}
