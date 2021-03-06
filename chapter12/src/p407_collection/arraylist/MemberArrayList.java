package p407_collection.arraylist;

import java.util.ArrayList; // improt
import java.util.Iterator;

import p407_collection.Member;	 // collection.Member



public class MemberArrayList {
	private ArrayList<Member> arrayList;	//ArrayList 선언

	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();		// 멤버로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) {		//  ArrayList에 멤버 추가
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {		//멤버 아이디를 매개변수로, 삭제 여부를 반환
		
		/*for(int i = 0; i < arrayList.size(); i++) {		// 해당 아이디를 가진 멤버를 ArrayList에서 찾음
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {				// 멤버아이디가 매개변수와 일치하면
				arrayList.remove(i);				//해당 멤버를 삭제
				return true;						// true 반환 
			}
		}*/
		
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {						// 0번째 방에 값이 존재하면 True , 존재하지 않으면 False
			Member member = ir.next();				//hasNext방의 값을 가지고옴
			int tempId = member.getMemberId();		//멤버아이디가 매개변수와 일치하면
			if(tempId == memberId) {				//해당 멤버를 삭제
				arrayList.remove(member);			//true반환
				return true;
			}
		}
		
		
		System.out.println(memberId + "가 존재하지 않습니다.");		//for 가 끝날때 까지 return이 안된경우
		return false;
	}
	public void showAllMember() {				//전체 회원을 출력하는 메서드
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
