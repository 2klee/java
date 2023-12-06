package chap07;

import java.util.ArrayList;

public class Student {

  // 멤버변수
  int studentID;
  String studentName;
  ArrayList<Subject> subjectList;


  public Student(int studentID, String studentName) {
    this.studentID = studentID;
    this.studentName = studentName;
    subjectList = new ArrayList<Subject>(); // ArrayList 생성하기
  }


  public void addSubject(String name, int score){
    Subject subject = new Subject();
    subject.setName(name); // 과목 이름 추가
    subject.setScore(score); // 과목 점수 추가
    subjectList.add(subject); // 배열에 저장하기
  }


  // 학생 정보를 출력하는 메소드
  public void showStudentInfo(){
    int total = 0;
    for(Subject s : subjectList){
      total += s.getScore(); // 총점 더하기
      System.out.println("학생 " + studentName + "의 " + s.getName() + "성적은 "
      + s.getScore() + "점 입니다.");
    }

    System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다");
  }

}
