import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class ShoppingInfo {
  private static int count = 0; // 번호를 저장할 변수
  private int number;
  private String shoppingMallType;
  private String productCategory;
  private String productName;
  private String deliveryInfo;

  public ShoppingInfo(String shoppingMallType, String productCategory, String productName, String deliveryInfo) {
    this.number = ++count;
    this.shoppingMallType = shoppingMallType;
    this.productCategory = productCategory;
    this.productName = productName;
    this.deliveryInfo = deliveryInfo;
  }

  public int getNumber() {
    return number;
  }

  public String getShoppingMallType() {
    return shoppingMallType;
  }

  public String getProductCategory() {
    return productCategory;
  }

  public String getProductName() {
    return productName;
  }

  public String getDeliveryInfo() {
    return deliveryInfo;
  }
}

public class ShoppingInfoListExample {
  public static void main(String[] args) {
    List<String> shoppingMallTypes = Arrays.asList("브랜드몰", "종합쇼핑몰", "중고거래", "기타");
    List<String> productCategories = Arrays.asList("의류", "신발", "시계", "가방", "지갑", "기타");
    List<String> deliveryInfos = Arrays.asList("직거래", "택배", "반값택배", "퀵", "기타");
    ArrayList<ShoppingInfo> shoppingInfoList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      // 사용자로부터 입력 받기
      System.out.print("쇼핑 정보 입력은 1, 출력은 2, 삭제는 3, 종료하려면 0을 입력하세요 >> ");
      int choice = scanner.nextInt();

      if (choice == 0) {
        break;
      } else if (choice == 1) {
        // 쇼핑 정보 입력
        shoppingInfoList.add(getShoppingInfoFromUser(shoppingMallTypes, productCategories, deliveryInfos));
      } else if (choice == 2) {
        // 쇼핑 리스트 출력
        showShoppingInfoList(shoppingInfoList);
      } else if (choice == 3) {
        // 쇼핑 정보 삭제
        deleteShoppingInfo(shoppingInfoList);
      } else {
        System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
      }
    }

    System.out.println("프로그램을 종료합니다.");
    scanner.close();
  }

  private static ShoppingInfo getShoppingInfoFromUser(List<String> shoppingMallTypes, List<String> productCategories, List<String> deliveryInfos) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("< 쇼핑 정보를 입력하세요 >");

    // Display options for shopping mall types
    System.out.println("쇼핑몰 종류를 선택하세요:");
    for (int i = 0; i < shoppingMallTypes.size(); i++) {
      System.out.print("[ " + (i + 1) + ". " + shoppingMallTypes.get(i) + " ] ");
    }
    System.out.print("\n쇼핑몰 종류를 선택하세요: ");
    int mallTypeChoice = scanner.nextInt();
    String shoppingMallType = shoppingMallTypes.get(mallTypeChoice - 1);

    // Display options for product categories
    System.out.println("제품 카테고리를 선택하세요:");
    for (int i = 0; i < productCategories.size(); i++) {
      System.out.print("[ " + (i + 1) + ". " + productCategories.get(i) + " ] ");
    }
    System.out.print("\n제품 카테고리를 선택하세요: ");
    int categoryChoice = scanner.nextInt();
    String productCategory = productCategories.get(categoryChoice - 1);

    // Display options for delivery information
    System.out.println("배송 정보를 선택하세요:");
    for (int i = 0; i < deliveryInfos.size(); i++) {
      System.out.print("[ " + (i + 1) + ". " + deliveryInfos.get(i) + " ] ");
    }
    System.out.print("\n배송 정보를 선택하세요: ");
    int deliveryChoice = scanner.nextInt();
    String deliveryInfo = deliveryInfos.get(deliveryChoice - 1);

    // Get the rest of the information
    System.out.print("제품명을 입력하세요: ");
    String productName = scanner.next();

    System.out.println("입력하신 정보가 저장되었습니다.");

    return new ShoppingInfo(shoppingMallType, productCategory, productName, deliveryInfo);
  }

  private static void showShoppingInfoList(ArrayList<ShoppingInfo> shoppingInfoList) {
    System.out.println("쇼핑 리스트를 출력합니다:");
    System.out.println("[No.][\t 쇼핑몰 \t] [ 카테고리 ] [\t 제품명 \t] [ 거래방법 ]");
    for (ShoppingInfo info : shoppingInfoList) {
      System.out.println(" " + info.getNumber() +
                       " | " + info.getShoppingMallType() +
                       " | " + "\t" + info.getProductCategory() + "\t" +
                       " | " + "\t" + info.getProductName() + "\t" +
                       " | " + info.getDeliveryInfo());
      System.out.println("--------------------------------------------");
    }
  }

  private static void deleteShoppingInfo(ArrayList<ShoppingInfo> shoppingInfoList) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("삭제할 쇼핑 정보의 번호를 입력하세요 : ");
    int numberToDelete = scanner.nextInt();

    boolean isDeleted = false;

    // 입력받은 번호와 일치하는 쇼핑 정보 찾아 삭제
    for (ShoppingInfo info : shoppingInfoList) {
      if (info.getNumber() == numberToDelete) {
        shoppingInfoList.remove(info);
        System.out.println("쇼핑 정보가 삭제되었습니다.");
        isDeleted = true;
        break;
      }
    }

    if (!isDeleted) {
      System.out.println("해당 번호의 쇼핑 정보를 찾을 수 없습니다.");
    }
  }
}
