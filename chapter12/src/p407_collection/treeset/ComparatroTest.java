package p407_collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Mycompare implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2))*-1;
	}
}

public class ComparatroTest {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new Mycompare());
		// String 은 Final compareTo() 메소드의 ASC만 구현 되어 있음.
		// String 형에서 DESC 할 경우, Comparator를 구현 해야 한다
		
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
	}

}
