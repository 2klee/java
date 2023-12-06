package chap13.stream;

import java.util.ArrayList;
import java.util.List;


public class TravelTest {

  public static void main(String[] args) {
    TravelCustomer customer1 = new TravelCustomer("이순신",40,100);
    TravelCustomer customer2 = new TravelCustomer("김유신",50,100);
    TravelCustomer customer3 = new TravelCustomer("홍길동",15,100);

    List<TravelCustomer> arr = new ArrayList<>();

    // 세명의 고객을 arrayList 추가하고 스트림을 생성해
    arr.add(customer1);
    arr.add(customer2);
    arr.add(customer3);

    // 1. 고객 명단을 출력
    System.out.println("===== 고객 명단 =====");
    arr.stream().map(a->a.getName())
            .forEach(a-> System.out.println(a));

    // 2. 여행의 총 비용 계산
    int total = arr.stream().mapToInt(c-> c.getPrice()).sum();
    System.out.println("총 여행 경비는 " + total + "원 입니다.");

    // 3. 고객 중 20세 이상인 사람의 이름을 정렬 출력
    System.out.println("=== 20세 이상 ===");
    arr.stream().filter(c->c.getAge() >= 20)
            .map(c->c.getName()).sorted().forEach(s -> System.out.println(s));
  }
}
