package inheritance2;

public class Student extends Person {

	public void set() {
		age = 30;
		name = "ȫ�浿";
		heigth = 175;
		//weight = 99;  // Private �̶� setter�� ���ؼ� ������ ���� �Ҵ�
		setWeight(99);
	}
}