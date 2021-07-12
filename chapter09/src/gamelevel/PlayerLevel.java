package gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) {  // ���ø� �޽��� ( �۾��� ������ ����_
		run();
		for(int i = 0; i < count ; i++) { 	 // 1. run() �޼ҵ� �۵�
			jump();							// 2. jump() for�� ���鼭 count���ڸ�ŭ�ݺ�
		}
			turn();		}					//	turn()
	
			final public void gotest(int a) {
				System.out.println("final�� �޼��忡 �Ҵ� �� ��� : �������̵� �Ұ���.");
			}
			public void gotest2() {
				System.out.println("�޼ҵ忡 final�� ���� ��� �������̵� ����");
			}
}
