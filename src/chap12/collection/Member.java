package chap12.collection;

public class Member implements Comparable<Member>{
  private int memberId;
  private String memberName;

  public Member(int memberId, String memberName) {
    this.memberId = memberId;
    this.memberName = memberName;
  }

  public int getMemberId() {
    return memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  // 231116 추가
  @Override
  public int hashCode(){
    return memberId; // hashCode() 메서드가
  }                   // memberId를 리턴하도록 재정의

  @Override
  public boolean equals(Object obj){
    if (obj instanceof Member){
      Member member = (Member) obj;
      // 매개변수로 받은 회원 Id 자신의 회원 Id와 같으면
      // true 반환
      if(this.memberId == member.memberId){
        return true;
      } else return false;
    }
    return false;
  }



  @Override
  public String toString(){
    return memberName + "회원님의 아이디는 " + memberId + " 입니다.";
  }


  // 231116 Comparable 관련 추가
  // 추가한 회원 아이디와 매개변수로 받은 회원 아이디를 비교
  @Override
  public int compareTo(Member member){
    return (this.memberId - member.memberId)*-1;
  }



}
