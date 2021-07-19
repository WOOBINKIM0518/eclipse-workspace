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
	
	public boolean removeMember(int memberId) { 		//HashSet에서는 get(i)를 사용 못한다.
	
		Iterator<Member> ir = hashSet.iterator();		//index를 가지고 있지 않다. Iterator를 사용해야 한다.	
		
		//hashSet 에 iterator 사용하겠다 라고 선언
		while(ir.hasNext()) {					
			Member member = ir.next();			
			int tempId = member.getMemberId();		
			if(tempId == memberId) {				
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + " 가 존재하지 않습니다"	);
		return false;
	}
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
