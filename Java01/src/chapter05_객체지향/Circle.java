package chapter05_��ü����;

public class Circle { //Ŭ���� �̸�
	int radius;		//���� ������ 
	String name;	// ���� �̸�
	Circle pizza ;
	public Circle() {}  // Circle Ŭ������ �⺻ ������( Ŭ���� �̸��� ������ �ż��� => ������)
	// ��ǲ �Ű������� ����, �����({�߰�ȣ��})�� ���� ������ => �⺻ ������ _ �⺻�����ڴ� ������ ����
	
	public double getArea() {
		return 3.14 * radius *radius;
	}
	
	public static void main(String[] args) {
		Circle pizza ;
		pizza = new Circle();		//Circle ��ü�� �����ض�, ���۷��� �̸� pizza
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
