package chap12.collection.arraylist;

import chap12.collection.Member;

public class MemberArrayListTest {
  public static void main(String[] args) {


    MemberArrayList memberArrList = new MemberArrayList();

    // memberArrList.addMember(new Member(1001,"이지원")); 이렇게 해도 되지만 밑에 처럼 함.

    // 새로운 회원 인스턴스 생성
    Member memberLee = new Member(1001, "이지원");
    Member memberKim = new Member(1002, "김지원");
    Member memberPark = new Member(1003, "박지원");
    Member memberKang = new Member(1004, "강지원");
    Member memberNa = new Member(1005, "나지원");

    // ArrayList 회원 추가
    memberArrList.addMember(memberLee);
    memberArrList.addMember(memberKim);
    memberArrList.addMember(memberPark);
    memberArrList.addMember(memberKang);
    memberArrList.addMember(memberNa);



    // 전체회원 출력
    memberArrList.showAllMember();
    // 박 삭제
    memberArrList.removeMember(memberLee.getMemberId());
    memberArrList.removeMember(memberKang.getMemberId());
    // 전체회원 출력


    // 회원 추가
    Member memberSon = new Member(1005, "손지원");
    memberArrList.insertMember(memberSon, 2);
    memberArrList.showAllMember();
  }
}
