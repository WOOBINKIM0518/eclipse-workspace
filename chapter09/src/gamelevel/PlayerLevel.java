package gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {  // 템플릿 메스드 ( 작업의 순서를 정의_
		run();
		for(int i = 0; i < count ; i++) { 	 // 1. run() 메소드 작동
			jump();							// 2. jump() for문 돌면서 count숫자만큼반복
		}
			turn();		}					//	turn()
	
			final public void gotest(int a) {
				System.out.println("final이 메서드에 할당 될 경우 : 오버라이딩 불가함.");
			}
			public void gotest2() {
				System.out.println("메소드에 final이 없을 경우 오버라이딩 가능");
			}
}
