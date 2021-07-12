package chapter02;

public class Constant {

	public static void main(String[] args) {

		final int MAX_NUM = 100; // 상수 선언과 동시에 값 할당
		int max_Num = 100;
		final int MIN_NUM;  // 상수선언
		
		MIN_NUM = 0;   // 상수에 값 할당
	
		//MAX_NUM=1000; 오류발생 WHY ?  변하지 않는 상수 final을 사용 했기 때문
		// 상수에 다른값을 넣을 수 없다
		
		max_Num = 200;  // int형은 변수 이기 때문에 위에서 100이라고 값을 할당해도
						// 밑에서 200으로 수정하면 수정한 값이 산출됨 ! 
						// 상수와 변수의 가장 큰 차이점 !! 기억할 것
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(max_Num);
	

	}

}
