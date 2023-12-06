package chap11;

class Date{
  int day;
  int month;
  int year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public boolean equals(Object obj){
    if(obj instanceof Date){
      Date dt = (Date) obj;
      if(this.day == dt.day && this.month == dt.month && this.year == dt.year){
       return true;
      }else return false;
    }
    return false;
  }

  @Override
  public int hashCode(){
    return day + month + year;
  }


}

public class MyDateTest {
  public static void main(String[] args) {
    Date date1 = new Date(16,11,2023);
    Date date2 = new Date(16,11,2023);

    System.out.println("date1의 hashCode값 : " + date1.hashCode());
    System.out.println("date2의 hashCode값 : " + date2.hashCode());

    System.out.println("date1의 실제 주소값 : " + System.identityHashCode(date1));
    System.out.println("date2의 실제 주소값 : " + System.identityHashCode(date2));


//    System.out.println(date1.equals(date2));
  }
}
