// 논리 곱 두 항 모두 참인 경우 결과 값이 참이다 

package chapter03_연산자;

public class OperationEx06_01 {

	public static void main(String[] args) {

		int num1 =10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0 ); //  T  T두 항 모두 True 일때 True
		System.out.println(flag);
		
		boolean flag2 = (num1 > 0) && (num2 < 0 );//  T  F
		System.out.println(flag2);
		
		boolean flag3 = (num1 < 0) && (num2 > 0 );// F  T
		System.out.println(flag3);
		
		boolean flag4 = (num1 < 0) && (num2 < 0 );// F  F
		System.out.println(flag4);
		
		
		
	}

}
