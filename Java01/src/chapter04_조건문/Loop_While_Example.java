package chapter04_조건문;

public class Loop_While_Example {

	public static void main(String[] args) {

		int num = 1;		//num :  1~10까지 더한 연산
		int sum = 0;		//sum :  합한 결과를 담은 변수
		
		// num = 20일 경우 조건식이 False 이기 때문에 
		// 아래 조건을 진행 시키지 않는다.
		// sum = 0 // num = 20
		
		while(num<=10){  // 조건이 만족하면 안에 구문 실행   // 거짓이면 실행 안함
			sum +=num; // sum = sum + num
			num++; // num 을 1씩 더함(= 올림)
			// sum = sum + num
			//  1   =  0 +  1     <== Loop 1
			//  3   =  1 +  2     <== Loop 2
			//  6   =  3 +  3     <== Loop 3
			//  10  =  6 +  4     <== Loop 4
			//  15  =  10 + 5     <== Loop 5
			//  21  =  15 + 6     <== Loop 6
			//  28  =  21 + 7     <== Loop 7
			//  36  =  28 + 8     <== Loop 8
			//  45  =  36 + 9     <== Loop 9
			//  55  =  45 + 10    <== Loop 10
			//  num  = 11   < == False _ While 빠져나와서 다음 명령어 진행
			
			
			
		}
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다");
		System.out.println("sum : "+ sum);
		System.out.println("num : "+ num);
	
	}

}
