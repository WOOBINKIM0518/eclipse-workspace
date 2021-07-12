package abstractex;  // 추상클래스 틀을 만든다

public abstract class Computer {		//추상 메소드를 포함. 템플릿, 프레임워크구현, 인터페이스 구현.

	public abstract void display();			//추상 메소드 : 선언부만 존재하고 , 실행부가 없는 메소드   "{실행부(실행코드)}"
	abstract public void typing();			//추상 메소드
	
	//public int add(int a , int b) {};			//일반 메소드
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
