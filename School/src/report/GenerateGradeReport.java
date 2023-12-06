package report;

import School.School;
import School.Student;
import School.Subject;
import School.Score;
import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import util.Define;

import java.util.ArrayList;

public class GenerateGradeReport {

  School school = School.getInstance();

  public static final String TITLE = "수강생 학점 \t\t\n";
  public static final String HEADER = "이름    |   학번   |  필수과목  |  점수 \n";
  public static final String LINE = "---------------------------------------\n";

  private StringBuffer buffer = new StringBuffer();

  public void makeHeader(Subject subject){
    buffer.append(GenerateGradeReport.LINE);
    buffer.append("\t" + subject.getSubject());
    buffer.append(GenerateGradeReport.TITLE);
    buffer.append(GenerateGradeReport.HEADER);
    buffer.append(GenerateGradeReport.LINE);
  }

  public void makeBody(Subject subject){
    ArrayList<Student> studentList = subject.getStudentList(); // 각 과목의 학생들
    for(int i = 0; i < studentList.size(); i++){
      Student student = studentList.get(i);
      buffer.append(student.getStudentName());
      buffer.append("  |  ");
      buffer.append(student.getStudentId());
      buffer.append("  |  ");
      buffer.append(student.getMajorSubject().getSubject() + "\t");
      buffer.append("|  ");

      //TODO : 학생별 해당과목 학점 계산
      getScoreGrade(student,subject); // 학생별 해당과목 점수계산
      buffer.append("\n");
      buffer.append(LINE);

    }
  }

  public void makeFooter(){
    buffer.append("\n");
  }

  public void getScoreGrade(Student student,Subject subject){
    ArrayList<Score> scoreList = student.getScoreList();
    int majorId = student.getMajorSubject().getSubjectId();

    // 학점 평가 클래스들
    GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};

    for(int i=0; i < scoreList.size(); i++) { //학생이 가진 점수리스트
      Score score = scoreList.get(i);
      if(score.getSubject().getSubjectId() == subject.getSubjectId()){
        String grade;

        if(subject.getGradeType() == Define.PF_TYPE){
          grade = gradeEvaluations[Define.PF_TYPE].getGrade(score.getPoint());
        }else {
          if (score.getSubject().getSubjectId() == majorId){ //필수과목인 경우
            grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
          }else { //일반과목인 경우
            grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
          }
        }


        buffer.append(score.getPoint());
        buffer.append(":");
        buffer.append(grade);
        buffer.append(" | ");
      }
    }
  }

  public String getReport(){
    ArrayList<Subject> subjectList = school.getSubjectList(); // 모든 과목에 대한

    for(Subject subject : subjectList){
      makeHeader(subject);
      makeBody(subject);
      makeFooter();
    }
    return buffer.toString(); // String으로 반환
  }

}
