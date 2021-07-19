package p407_collection.hashset;

import p407_collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서훤");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
			//hashSet은 순서대로 저장되지 않는다.
			//출력 또한 순서대로 출력되지 않는다.
		
		Member memberHong1 = new Member(1003, "홍길동");
		Member memberHong2 = new Member(1003, "홍길동");
		Member memberHong3 = new Member(1003, "홍길동");
		Member memberHong4 = new Member(1003, "홍길동");
		
		
		memberHashSet.addMember(memberHong1);
		memberHashSet.addMember(memberHong2);
		memberHashSet.addMember(memberHong3);
		memberHashSet.addMember(memberHong4);
		memberHashSet.showAllMember();
	}

}
