package bookshelf;

import java.lang.*; // �⺻������ ������(java.lang*�� ��� Ŭ������ ���)


public class BookShelfTest {

	public static void main(String[] args) {		
	
		Queue shelfQueue = new BookShelf();		//��ĳ���� 
		
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
