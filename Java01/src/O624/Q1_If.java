package O624;

public class Q1_If {
	public static void main(String[] args) {
	
		int num1 =10;
		int num2 =2;
		char operator = '1';
		
		int result = 0;
		
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
			return; // 적용 안하면 아래 "결과 값은 0 입니다." 가(이) 출력됨 
		}
		System.out.println("결과 값은 "+ result + " 입니다.");
		}
	}

