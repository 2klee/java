import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapNation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> nations = new HashMap<String, Integer>();

    System.out.println("나라 이름과 인구를 5개 입력하세요.(예 Korea 5000");

    for(int i = 0 ; i < 5 ; i++){
      System.out.print("나라 이름, 인구 >> ");

      String nation = sc.next();
      int pop = sc.nextInt();

      nations.put(nation, pop);
    }

    int bigPop = 0;
    String bigNation = "";

    Set<String> names = nations.keySet();
    Iterator<String> ir = names.iterator();
    while (ir.hasNext()){
      String name = ir.next();
      int n = nations.get(name);
      if(bigPop < n){
        bigPop = n;
        bigNation = name;
      }
    }
    System.out.println("제일 인구가 많은 나라는 (" + bigNation + " " + bigPop + ")");
    sc.close();
  }
}
