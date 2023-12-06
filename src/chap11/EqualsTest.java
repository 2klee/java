package chap11;

class Student{
  int studentId;
  String studentName;

  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  @Override
  public String toString() {
    return studentId + ", " + studentName;
  }

  @Override
  public boolean equals(Object obj){
    if(obj instanceof Book){
      Student std = (Student) obj;
      if(this.studentId == std.studentId){
        return true;
      }else  return false;
    }
    return false;
  }

  // hashCode2 추가
  @Override
  public int hashCode(){
    return studentId;
  }


}

public class EqualsTest {

  public static void main(String[] args) {
  Student student1 = new Student(100,"이상원");
  Student student2 = student1;
  Student student3 = new Student(100, "이상원");

  // hashCode2 추가
    System.out.println("student1의 hashCode값 : " + student1.hashCode());
    System.out.println("student2의 hashCode값 : " + student2.hashCode());
    System.out.println("student3의 hashCode값 : " + student3.hashCode());

    System.out.println("student1의 실제 주소값 : " + System.identityHashCode(student1));
    System.out.println("student2의 실제 주소값 : " + System.identityHashCode(student2));
    System.out.println("student3의 실제 주소값 : " + System.identityHashCode(student3));


  // hashCode1 추가
//  String str1 = new String("abc");
//  String str2 = new String("abc");
//  System.out.println(str1.hashCode());
//  System.out.println(str2.hashCode());
//
//  Integer i1 = new Integer(100);
//  Integer i2 = new Integer(100);
//  System.out.println(i1.hashCode());
//  System.out.println(i2.hashCode());

//
//  String str1 = new String("abd");
//  String str2 = new String("abd");
//
//  System.out.println(str1 == str2);
//  System.out.println(str1.equals(str2));
//
//  Integer i1 = new Integer(100);
//  Integer i2 = new Integer(100);
//
//    System.out.println(i1 == i2);
//    System.out.println(i1.equals(i2));
//
//
//
//
//
//  if(student1 == student2){
//    System.out.println("student1 과 student2의 주소가 같습니다.");
//  } else {
//    System.out.println("student1 과 student2의 주소가 다릅니다.");
//  }
//
//  if(student1.equals(student2)){
//    System.out.println("student1 과 student2는 동일합니다.");
//  }else {
//    System.out.println("student1 과 student2는 다릅니다.");
//  }
//
//  if(student1 == student3){
//    System.out.println("student1 과 student3의 주소가 같습니다.");
//  } else {
//    System.out.println("student1 과 student의 주소가 다릅니다.");
//  }
//
//  if(student1.equals(student3)){
//    System.out.println("student1 과 student3는 동일합니다.");
//  }else {
//    System.out.println("student1 과 student3는 다릅니다.");
//  }



 }


}
