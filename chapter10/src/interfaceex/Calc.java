package interfaceex;

public interface Calc {
		//interface는 상수와 추상메소드의 집합, 멤버변수는 올 수 없다.
	
	//변수 같아 보이지만 상수 why ? 클래스가 아니고  인터페이스이기 때문에  (클래스에선 변수)
	// 만약 추상 클래스였다면 밑에(선언부 없는 친구들) abstract 꼭 입력해 주어야함 
	
	double PI = 3.14;		//public static final 생략됨   상수
	int ERROR = -999999999; //public static final 생략됨   상수
	
	int add (int num1, int num2);			//public abstract 생략됨 선언부만있고 구현부 없음
	int substract (int num1, int num2);		// 일반 메서드 같아 보이지만 추상 메서드임!! 
	int times (int num1, int num2);
	int divide (int num1 ,int num2);
	
	
}
