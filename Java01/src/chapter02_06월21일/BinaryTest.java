package chapter02_06월21일;

public class BinaryTest {

	public static void main(String[] args) {

		int num = 10;        // 
		int bNum = 0B1010;   //0B라고 시작되면 2진법으로 값을 할당
		int oNum = 012;      // 0라고 시작되면 8진법으로 값을 할당
		int hNum = 0XA;      //0X라고 시작되면 16진법으로 값을 할당
		
		int test = -10;		
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		System.out.println(test);
		
	}

}
