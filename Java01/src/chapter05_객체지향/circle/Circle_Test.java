package chapter05_��ü����.circle;

import chapter05_��ü����.circle.Circle;

public class Circle_Test {

	public static void main(String[] args) {

		Circle pizza = new Circle();		//Circle ��ü�� �����ض�, ���۷��� �̸� pizza
		pizza.radius = 10; //������ �������פ� 10���� ����
		pizza.name = "�ڹ�����"; // ������ �̸��� ����
		double area = pizza.getArea(); // ������ ����(getArea()�� ȣ�� �ؼ� area������ �Ҵ�)
				
		System.out.println("������ �̸��� "+pizza.name+ "��������"+pizza.radius+"�Դϴ�.");
		System.out.println("������ ������"+pizza.getArea());
		
		
		Circle donut = new Circle(); // Circle ��ü ����, ���۷��� �̸� donut
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = +donut.getArea(); // ������ �տ� double �ٴµ� ���� �� �Ⱥ��� ?>   �ٷ� ������ ����Ǿ �Ƚᵵ �ȴٰ���
		
		System.out.println("������ �̸��� "+donut.name+ "��������"+donut.radius+"�Դϴ�.");
		System.out.println("������ ������" +donut.getArea());
		
		
		
	}

}
// �����ϴ� class ���� 