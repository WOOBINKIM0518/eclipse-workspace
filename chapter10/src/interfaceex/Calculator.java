package interfaceex;

public abstract class Calculator implements Calc {
			// 인터페이스의 일부 메서드만 구현하는 경우 추상클래스(abstract)가 되어야 한다.
		
	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {//인터페이스를 구현하는 매서드에서
		return num1-num2;						// 반드시 public 치 되어야 한다)
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하셨습니다.");

	}
	
}