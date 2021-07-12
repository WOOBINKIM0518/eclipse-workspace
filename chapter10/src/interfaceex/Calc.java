package interfaceex;

public interface Calc {
		//interface는 상수와 추상메소드의 집합, 멤버변수는 올 수 없다.
	
	
	double PI = 3.14;		//public static final 생략됨   상수
	int ERROR = -999999999; //public static final 생략됨   상수
	
	int add (int num1, int num2);			//public abstract 생략됨 선언부만있고 구현부 없음
	int substract (int num1, int num2);		//
	int times (int num1, int num2);
	int divide (int num1 ,int num2);
	
	
}
