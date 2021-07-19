package p407_collection.hashset;

import p407_collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();
			//hashSet�� ������� ������� �ʴ´�.
			//��� ���� ������� ��µ��� �ʴ´�.
		
		Member memberHong1 = new Member(1003, "ȫ�浿");
		Member memberHong2 = new Member(1003, "ȫ�浿");
		Member memberHong3 = new Member(1003, "ȫ�浿");
		Member memberHong4 = new Member(1003, "ȫ�浿");
		
		
		memberHashSet.addMember(memberHong1);
		memberHashSet.addMember(memberHong2);
		memberHashSet.addMember(memberHong3);
		memberHashSet.addMember(memberHong4);
		memberHashSet.showAllMember();
	}

}
