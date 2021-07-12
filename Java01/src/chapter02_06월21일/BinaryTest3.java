package chapter02_06월21일;

public class BinaryTest3 {

	public static void main(String[] args) {
		
		int num1 = 0B00000000000000000000000001000110; 
		// 양수 : 70
		int num2 = 0B11111111111111111111111110111010;  
		//음수 : -70 , 양수 70의 보수에다가 더하기 1

		// 0B는 2진법을 나타낸다 / 그다음 0은 양수 1은 음수
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
