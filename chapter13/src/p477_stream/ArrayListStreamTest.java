package p477_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();			//스트림을  생성해서 인스턴스 변수에 할당
		stream.forEach(s->System.out.print(s+" "));		// 스트림은 매번 생성해서 사용
		System.out.println();
		System.out.println("====================================");
		
		sList.stream().sorted().forEach(s->System.out.print(s+" "));		// sorted : ASC정렬 (오름차순)
		System.out.println();
		System.out.println("====================================");
		//stream.sorted().forEach(s->System.out.println(s+ " "));
		sList.stream().map(s ->s.length()).forEach(n->System.out.println(n));
		//sList.stream().filter(s->s.length() >=5).forEach(s->System.out.println(s));
		
	}

}
