// 06월 22일 (화) 복합 대입 연산자 

package chapter03_연산자;

public class OperationEx07 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		
		num1 += num2;  // num1 = num1 + num2
		
		System.out.println(num1);
	
		num1 -= num2;  // num1 = num1 - num2  num1은 위에서 실행 받은 30이 들어가 있음
		System.out.println(num1);
		
		num1 *= 2;     //  num1 = num1 *2  // num1은 위에서 실행 받은 10이 들어가 있음
		System.out.println(num1);
		
		num1 /= 2;     //  num1 = num1 /2   // num 1은 위에서 실행받은 20이 들어가 있음
		System.out.println(num1);
		
		num1 %= 2;     // num1 = num1 %2  // num 1은 위에서 실행 받은 10이 들어가 있음
		System.out.println(num1);		
				
		
		// 
		
		
	}

}
