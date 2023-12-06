package test;

import School.School;
import School.Subject;
import School.Student;
import School.Score;
import report.GenerateGradeReport;
import util.Define;

public class TestMain {

  School busanSchool = School.getInstance();
  Subject korean;
  Subject math;
  Subject history;

  GenerateGradeReport gradeReport = new GenerateGradeReport();

  public static void main(String[] args) {

    TestMain test = new TestMain();

    test.createSubject();
    test.createStudent();

    String report = test.gradeReport.getReport(); // 성적 결과 생성
    System.out.println(report); // report 출력

  }

    // 테스트 학생 생성
  public void createStudent(){
    Student student1 = new Student(181213, "제우스", korean);
    Student student2 = new Student(182330, "오너", math);
    Student student3 = new Student(171518, "페이커", korean);
    Student student4 = new Student(172350, "구마유시", korean);
    Student student5 = new Student(171290, "케리아", math);

    busanSchool.addStudent(student1);
    busanSchool.addStudent(student2);
    busanSchool.addStudent(student3);
    busanSchool.addStudent(student4);
    busanSchool.addStudent(student5);

    korean.register(student1);
    korean.register(student2);
    korean.register(student3);
    korean.register(student4);
    korean.register(student5);

    math.register(student1);
    math.register(student2);
    math.register(student3);
    math.register(student4);
    math.register(student5);

    history.register(student1);
    history.register(student2);
    history.register(student3);
    history.register(student4);
    history.register(student5);

    addScoreForStudent(student1, math, 95);
    addScoreForStudent(student1, korean, 56);
    addScoreForStudent(student1, history, 100);

    addScoreForStudent(student2, math, 95);
    addScoreForStudent(student2, korean, 98);
    addScoreForStudent(student2, history, 90);

    addScoreForStudent(student3, math, 100);
    addScoreForStudent(student3, korean, 80);
    addScoreForStudent(student3, history, 90);

    addScoreForStudent(student4, math, 89);
    addScoreForStudent(student4, korean, 95);
    addScoreForStudent(student4, history, 80);

    addScoreForStudent(student5, math, 83);
    addScoreForStudent(student5, korean, 56);
    addScoreForStudent(student5, history, 60);

  }

  // 테스트 과목 생성
  public void createSubject(){
    korean = new Subject("국어", Define.KOREAN);
    math = new Subject("수학", Define.MATH);
    history = new Subject("역사", Define.HISTORY);

    history.setGradeType(Define.PF_TYPE); // Define에 추가할 걸 여기에 추가해서 변경.

    busanSchool.addSubject(korean);
    busanSchool.addSubject(math);
    busanSchool.addSubject(history);
  }

  public void addScoreForStudent(Student student, Subject subject, int point){
    Score score = new Score(student.getStudentId(),subject, point);
    student.addSubjectScore(score);

  }
}
