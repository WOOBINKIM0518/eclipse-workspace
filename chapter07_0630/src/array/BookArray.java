package array;

public class BookArray {

	public static void main(String[] args) {
		Book [] library = new Book[5];  // 객체 타입의 배열 선언 ㅡ 생성
		
		for (int i = 0 ; i <library.length ; i++) {
			System.out.println(library[i]);
		}
		
	}

}
