package O624;

import java.util.Scanner;

public class ScannerEx8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("무슨 커피로 드릴 까요?");
		String coffee = scanner.next();
		
		switch(coffee) {
		case "에스프레소" : case "카푸치노" : case "카페라떼" :
			System.out.println("3,500원 입니다.");
		break;
		case "아메리카노" : 
			System.out.println("2,000원 입니다");
		break;	
		default :
			System.out.println("없는 커피 입니다.");
		
		scanner.close();
		}
	}
}
