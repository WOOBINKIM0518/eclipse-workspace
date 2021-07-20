package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex6 {
	public static void main(String[] args) {
		//사용자 이름과 점수를 기록하는 HashMap컬렉션 생성
		HashMap<String , Integer> javaScore = new HashMap <String , Integer>();
		
		//5개의 점수 저장
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap의 요소 개수 : " + javaScore.size());
		
		//모든 사람의 점수출력
		// javjaScore에 들어 있는 모든(key , value) 쌍 출력
		//key 문자열을 가진 집합 Set컬렉션 리턴
		
		Set<String> keys = javaScore.keySet();
		
		//key 문자열을 순서대로 접근할 수 있는 Iteratro리턴
		
		Iterator<String> ir = keys.iterator();
		
		while(ir.hasNext()) {
			String name = ir.next();
			int score = javaScore.get(name);
			System.out.println(name + ":"+score);
		}
		
		
	}
}
