package p463_lambda;

	// @FunctionalInterface   // @ <== 어노테이션
	//ㄴ 함수형 인터페이스에서 메소드가 2개이상 들어갔는지 check 해서 오류 출력 */


public interface MyNumber {		// 함수형 인터페이스 ( 람다식에서 사용하는 인터페이스)
	
	
	int getMax(int num1 , int num2);	//하나의 메소드만 정의
	//int getMin(int num3 , int num4);		// 하나더 정의하면 테스트 클래스에서 오류

}
