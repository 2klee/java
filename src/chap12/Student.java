package chap12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Student {
  private int studentId;
  private String studentName;

  public Student(int studentId, String studentName){
    this.studentId = studentId;
    this.studentName = studentName;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }


  private HashSet<Student> hashSet;

  public void StudentArrayList(){
    hashSet = new HashSet<Student>();
  }
//
//  public void add(Student student){
//    hashSet.add(student);
//  }

  public boolean removeStudent(int studentId){
    Iterator<Student> ir = hashSet.iterator();

    while (ir.hasNext()){
      Student student = ir.next();
      int tempId = student.getStudentId();
      if(tempId == student.getStudentId()){
        hashSet.remove(student);
        return true;
      }
    }
    return false;
  }




  @Override
  public int hashCode() {
    return Objects.hash(studentId);
  }


  // 이상한 문자를 Id와 Name 으로 바꿔쥐기
  @Override
  public String toString() {
    return studentId + ":" + studentName;
  }

}
