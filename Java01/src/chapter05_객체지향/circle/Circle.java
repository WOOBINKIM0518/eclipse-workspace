package chapter05_��ü����.circle;

public class Circle {

	int radius;		//���� ������ 
	String name;	// ���� �̸�
	
	public Circle() {}  // Circle Ŭ������ �⺻ ������( Ŭ���� �̸��� ������ �ż��� => ������)
	// ��ǲ �Ű������� ����, �����({�߰�ȣ��})�� ���� ������ => �⺻ ������ _ �⺻�����ڴ� ������ ����
	
	public double getArea() {
		return 3.14 * radius *radius;
	}
}
//����� Ŭ���� �ΰ� 