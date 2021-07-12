package O624;

import java.util.Scanner;

public class Q1_Scanner_teacher01 {
	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);  
		// 커서를 Scanner 앞에 두고 Ctrl + Shift + O 누르면 자동으로 임포트
		//ㄴ 스캐너 객체 생성 소문자s로 시작하는 scanner는 임의로 임력 가능 
		
		System.out.println("연산자를 입력 하세요. ex) +,-,*,/");
		String S = scanner.next();	// 문자열을 받아서 S변수에 할당
		char operator = S.charAt(0); // 첫번째 문자를 char 형인 operator에 저장
		
		if(operator=='+') {
			result = num1 + num2;
		}
		else if(operator=='-') {
			result = num1 - num2;
		}
		else if(operator=='*') {
			result = num1 + num2;
		}
		else if(operator=='*') {
			result = num1 + num2;
		}
		else if(operator=='/') {
			result = num1 / num2;
		}
		else {
			System.out.println("연산자 오류입니다.");
			scanner.close();
			return; // 적용 안하면 아래 "결과 값은 0 입니다." 가(이) 출력됨 
		}
		System.out.println("결과 값은 "+ result + " 입니다.");
		
		scanner.close();
		}
	}

