package p440_map.hasmap;

import java.util.HashMap;
import java.util.Iterator;

import p407_collection.Member;

public class MemberHashMap {

		private HashMap<Integer, Member> hashMap;		//HashMap은 자료형 2개선은 <Key, Value>
		
		public MemberHashMap() {
			hashMap = new HashMap<Integer, Member>();
		}
		
		public void addMember(Member member) {					//HashMap 에 객체를 추가
			hashMap.put(member.getMemberId(),member);			//HashMap ==> put ( key, value)저장
		}
		
		public boolean removeMember(int memberId) {
			if(hashMap.containsKey(memberId)) {					//hashMap.containsKey() <== Key 값을 검색
				hashMap.remove(memberId);
				return true;
			}
			System.out.println(memberId + "가 존재하지 않습니다");
			return false;
		}
		
		public void showAllMember() {
			Iterator<Integer> ir = hashMap.keySet().iterator();
			while (ir.hasNext()) {
				int key = ir.next();
				Member member = hashMap.get(key);
				System.out.println(member);
			}
			System.out.println();
		}
	}
	
