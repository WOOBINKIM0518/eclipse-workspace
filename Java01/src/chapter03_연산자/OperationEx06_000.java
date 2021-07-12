// 단락 회로 평가 논리 합 || 결과값 

package chapter03_연산자;

public class OperationEx06_000 {

	public static void main(String[] args) {

		int num = 5;
		int i = 10;
		
		boolean value = ((num = num *10) >45 ) || ((i = i - 5) < 10);
		// 논리 합 앞 결과가 참이면 뒤의 결과 실행되지 않는다 .
		
		System.out.println(value);  // T  T   True
		System.out.println(num);    // 50
		System.out.println(i);		// 10  논리 합에서 앞에서의 결과값이 참인경우 뒤에 실행되지 않음
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		int num1 = 10;
		int j = 3;
		
		boolean value2 = ((num1 = num1 +10) > 200) || ((j = j-1) >3);
		//논리 합 앞 결과가 거짓이라면  앞의 결과 뒤의 결과 어떻게 출력 될까 ? 
		
		System.out.println(value2);         // False
		System.out.println(num1);			// 20
		System.out.println(j);				// 2
		
		// 아하!! 논리 합 앞의 결과가 거짓이라도 앞의 식과 뒤의식 모두 실행이 되는구나 ! 
		
		/*
		 * 단란 회로 평가 논리 합 정리 
		 * 
		 * 앞 항            뒷 항 
		 * T / 계산     T 상관없이 계산X boolean 결과 True 
		 *             F 상관없이 계산X boolean 결과 True 
		 *             
		 *  앞 항            뒷 항
		 * F / 계산      T 상관없이 계산 boolean 결과 True 
		 *              F 상관없이 계산 boolean 결과 False
		 */

	}

}
