package abstractex;  // �߻�Ŭ���� Ʋ�� �����

public abstract class Computer {		//�߻� �޼ҵ带 ����. ���ø�, �����ӿ�ũ����, �������̽� ����.

	public abstract void display();			//�߻� �޼ҵ� : ����θ� �����ϰ� , ����ΰ� ���� �޼ҵ�   "{�����(�����ڵ�)}"
	abstract public void typing();			//�߻� �޼ҵ�
	
	//public int add(int a , int b) {};			//�Ϲ� �޼ҵ�
	
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
