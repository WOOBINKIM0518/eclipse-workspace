package p407_collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
			//정렬해서 출력 ASC(오름차순 정렬), DES(내림차순 정렬)
			//중복된 데이터 하용하지 않음
		
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		
		
		
		treeSet.add("강감찬");
		treeSet.add("강감찬");
		treeSet.add("강감찬");				//중복된 데이터 허용 X

		
		for (String str : treeSet) {
			System.out.println(str);
		}
	
	}

}
