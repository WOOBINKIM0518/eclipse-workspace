package O624;

import java.util.Scanner;

public class Q1_Scanner_bin {
	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		
		Scanner scanner = new Scanner(System.in);  
		//ㄴ 스캐너 객체 생성 소문자s로 시작하는 scanner는 임의로 임력 가능 
		
		System.out.println("연산기호를 입력하세요.");
		
		char operator =scanner.next().charAt(0);
		
		if(operator=='+') 
			System.out.println(num1+num2);
		
		else if(operator=='-') 
			System.out.println(num1-num2);
		
		else if(operator=='*') 
			System.out.println(num1*num2);
		
		else if(operator=='/') 
			System.out.println(num1/num2);
		
		else 
			System.out.println("없는 연산 기호 입니다.");
					
		scanner.close();
		
		}
	}

