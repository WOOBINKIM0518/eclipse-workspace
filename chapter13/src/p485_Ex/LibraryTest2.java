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
		
		bookList.add(new Book1("자바", 25000));
		bookList.add(new Book1("파이썬", 15000));
		bookList.add(new Book1("안드로이드", 30000));
		
		int total = bookList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("모든 책의 가격의 합은 : " +total + " 입니다.");	
		
		System.out.println();
		System.out.println("==가격이 20,000원 이상인 책의 이름==");
		bookList.stream().filter(c -> c.getPrice() >= 20000).map(c -> c.getName()).sorted().forEach(s-> System.out.println(s));
	}

}
