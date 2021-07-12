// 단락 회로 논리 곱 , 논리 합 연습

package chapter03_연산자;

public class OperationEx06_00 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value =((num1 = num1+10)<10) && ((i = i+2)<10); 
		// 논리 곱에서 앞 항의 결과값이 거짓이므로 이 문장은 실행되지 않음
		
		System.out.println(value); // False
		System.out.println(num1); // 20
		System.out.println(i);  //2 
		
		
		//  num = 20
		//   i  = 2
		
		value = ((num1 = num1+10)>0) || ((i = i+2)<10);
		// 논리 합에서 앞 항의 결과 값이 참이므로 이 문장은 실행되지 않음
		
		System.out.println(value);  // True 
		System.out.println(num1);  // 20이 아니고 왜 30?  위에서 이어져
		System.out.println(i);    // 2
		
		
		// 정리  : 논리 곱 && 앞 결과 거짓  - > 뒷 항 실행 X   앞 거짓 이면 boolean False
		//	  	  논리 합 || 앞 결과 참   ->  뒷 항 실행 X	  앞 참 이면 boolean True
	}

}
