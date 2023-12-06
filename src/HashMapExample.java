import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    // HashMap 생성
    Map<String, Integer> hashMap = new HashMap<>();

    // 데이터 추가
    hashMap.put("Alice", 25);
    hashMap.put("Bob", 30);
    hashMap.put("Charlie", 28);

    // 데이터 조회
    int age = hashMap.get("Bob");
    System.out.println("Bob's age: " + age);

    // 키 존재 여부 확인
    boolean containsKey = hashMap.containsKey("Alice");
    System.out.println("Contains key 'Alice': " + containsKey);

    // 모든 키-값 쌍 출력
    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
  }
}
