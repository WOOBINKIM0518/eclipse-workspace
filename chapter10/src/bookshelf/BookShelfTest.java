package bookshelf;

import java.lang.*; // 기본적으로 생략됨(java.lang*의 모든 클래스를 사용)


public class BookShelfTest {

	public static void main(String[] args) {		
	
		Queue shelfQueue = new BookShelf();		//업캐스팅 
		
			shelfQueue.enQueue("태백산맥1");
			shelfQueue.enQueue("태백산맥2");
			shelfQueue.enQueue("태백산맥3");
			
			System.out.println(shelfQueue.getSize());
			
			System.out.println(shelfQueue.deQueue());
			System.out.println(shelfQueue.deQueue());
			System.out.println(shelfQueue.deQueue());
			
			System.out.println(shelfQueue.getSize());

	}
}
