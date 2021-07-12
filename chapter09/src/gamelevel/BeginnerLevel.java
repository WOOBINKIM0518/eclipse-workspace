package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("Jump할 줄 모르지롱.");
	}

	@Override
	public void turn() {
		 System.out.println("Turn할 줄 모르지롱.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보자 레벨입니다. *****");
	}
	
	/*@Override
	public void gotest() {}    < == 오버라이딩 불가 : final이 메서드에 할당 (슈퍼클래스)

	@Override
	public void gotest2() {}    < == 메소드에 final 없는경우 오버라이드 가능 
			*/
	}

