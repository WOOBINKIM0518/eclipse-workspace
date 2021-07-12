// 단락 회로 평가 논리 곱 && 결과값 

package chapter03_연산자;

public class OperationEx06_0000 {

	public static void main(String[] args) {


		int num1 = 10;
		int i = 2;
		
		boolean value =((num1 = num1+10)<10) && ((i = i+2)<10); 
		// 논리 곱에서 앞 항의 결과값이 거짓이므로 이 문장은 실행되지 않음
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		
		int num2 = 5;
		int j = 3;
				
		boolean value2 =((num2 = num2+10)<25) && ((j = j+2)<3); 
		
		
		System.out.println(value2);  // True
		System.out.println(num2);  //  15
		System.out.println(j);      // 5

		
		// 아하 ! 논리 곱에서 앞항의 결과 참이면 뒤 문장 실행 하는구나 ! 
		// 앞 항 참이고 뒷항 거짓이라면 ? ==> 그래도 계산 되는구나 but 불리언 값은 False
		
		/*
		 * 단란 회로 평가 논리 곱 정리 
		 * 
		 * 앞 항            뒷 항 
		 * T / 계산     T 상관없이 계산   boolean 결과 True 
		 *             F 상관없이 계산   boolean 결과 False 
		 *             
		 *  앞 항            뒷 항
		 * F / 계산      T 상관없이 계산x boolean 결과 False 
		 *              F 상관없이 계산x boolean 결과 False
		 */
	}

}
