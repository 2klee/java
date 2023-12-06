package chap12.collection.hashset;

import chap12.collection.Member;

public class MemberHashSetTest {
  public static void main(String[] args) {
    MemberHashSet memberHashSet = new MemberHashSet();

    Member memberIl = new Member(1001, "일지원");
    Member memberLee = new Member(1002, "이지원");
    Member memberSam = new Member(1003, "삼지원");

    memberHashSet.addMember(memberIl);
    memberHashSet.addMember(memberLee);
    memberHashSet.addMember(memberSam);
    memberHashSet.showAllMember();

    Member memberHong = new Member(1003, "홍지원");
    memberHashSet.addMember(memberHong);
    memberHashSet.showAllMember();


  }

}
