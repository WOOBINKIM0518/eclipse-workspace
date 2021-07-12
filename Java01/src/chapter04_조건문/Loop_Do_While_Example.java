package chapter04_조건문;

public class Loop_Do_While_Example {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		do {  // do 안에 구문 조건에 상관 없이 무조건 실행
			
			sum += num;    // sum = sum + num  
			num ++;
		// num 에 20을 넣는경우 do-while 구문은 조건이 False 여도 무조건 실행
		// 따라서                20  = 0 +  20
		//                     num ++;  ==>  21 
		// sum = 20  /  num = 21
			
			
		}while( num <= 10);  // while True일 동안 계속 반복
		
		System.out.println("1~10까지의 합은" + sum + "입니다.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
