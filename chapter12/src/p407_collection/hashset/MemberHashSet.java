package p407_collection.hashset;

import java.util.HashSet;

import java.util.Iterator;

import p407_collection.Member;



public class MemberHashSet {

	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) { 		//HashSet������ get(i)�� ��� ���Ѵ�.
	
		Iterator<Member> ir = hashSet.iterator();		//index�� ������ ���� �ʴ�. Iterator�� ����ؾ� �Ѵ�.	
		
		//hashSet �� iterator ����ϰڴ� ��� ����
		while(ir.hasNext()) {					
			Member member = ir.next();			
			int tempId = member.getMemberId();		
			if(tempId == memberId) {				
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + " �� �������� �ʽ��ϴ�"	);
		return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
