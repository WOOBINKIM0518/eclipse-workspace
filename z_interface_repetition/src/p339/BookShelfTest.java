package p339;

public class BookShelfTest {

	public static void main(String[] args) {		//업캐스팅
		Queue shelfQueue = new BookShelf();
		
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
