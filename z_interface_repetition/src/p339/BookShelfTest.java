package p339;

public class BookShelfTest {

	public static void main(String[] args) {		//��ĳ����
		Queue shelfQueue = new BookShelf();
		
			shelfQueue.enQueue("�¹���1");
			shelfQueue.enQueue("�¹���2");
			shelfQueue.enQueue("�¹���3");
			
			System.out.println(shelfQueue.getSize());
			
			System.out.println(shelfQueue.deQueue());
			System.out.println(shelfQueue.deQueue());
			System.out.println(shelfQueue.deQueue());
			
			System.out.println(shelfQueue.getSize());

	}
}
