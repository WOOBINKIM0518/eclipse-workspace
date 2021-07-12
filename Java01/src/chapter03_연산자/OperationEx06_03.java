// 논리연산자 부정 !(부정)


package chapter03_연산자;

public class OperationEx06_03 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		boolean flag ;
		
		// ! (not)  True ==> False, False ==> True
		
		flag = !(num1 > 0);					
		System.out.println(flag);    // True  ==> False
		
		flag = !(num2 > 0);
		System.out.println(flag);    // True  ==> False
		
		flag = !(num1 > num2);
		System.out.println(flag);    // False  ==> True
		
		flag = !(num1 < num2);
		System.out.println(flag);    // True  ==> False
		
	}

}
