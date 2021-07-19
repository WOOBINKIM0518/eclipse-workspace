package p407_collection.hashset;

import java.util.HashSet;			//HashSet 중복을 허용하지 않는다.

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		
		//  중복된 값을 저장할 수 없다.
		//  순서대로 저장되지 않는다.
		//  index가 생성되지 않는다.
		//  Iterator를 사용해서 출력 해야 한다.
		
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));		// 중복된 값을 허용하지 않는다.
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);
	}

}
