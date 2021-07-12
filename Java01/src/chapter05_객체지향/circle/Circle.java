package chapter05_객체지향.circle;

public class Circle {

	int radius;		//원의 반지름 
	String name;	// 원의 이름
	
	public Circle() {}  // Circle 클래스의 기본 생성자( 클래스 이름과 동일한 매서드 => 생성자)
	// 인풋 매개변수도 없고, 실행부({중괄호안})가 없는 생성자 => 기본 생성자 _ 기본생성자는 생략이 가능
	
	public double getArea() {
		return 3.14 * radius *radius;
	}
}
//선언부 클래스 두고 