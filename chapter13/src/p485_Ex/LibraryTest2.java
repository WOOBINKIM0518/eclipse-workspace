package p485_Ex;

import java.util.ArrayList;
import java.util.List;

class Book1{
	private String name;
	private int price;
	
	public Book1(String name, int price) {
		this.name = name;
		this.price	= price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}


public class LibraryTest2 {
	public static void main(String[] args) {
		List<Book1> bookList = new ArrayList<>();
		
		bookList.add(new Book1("�ڹ�", 25000));
		bookList.add(new Book1("���̽�", 15000));
		bookList.add(new Book1("�ȵ���̵�", 30000));
		
		int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("��� å�� ������ ���� : " +total + " �Դϴ�.");	
		
		System.out.println();
		System.out.println("==������ 20,000�� �̻��� å�� �̸�==");
		bookList.stream().filter(c -> c.getPrice() >= 20000).map(c -> c.getName()).sorted().forEach(s-> System.out.println(s));
	}

}
