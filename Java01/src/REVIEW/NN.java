package REVIEW;


public class NN {

	int radius;		//���� ������ 
	String name;	// ���� �̸�
	
	public NN() {}  // Circle Ŭ������ �⺻ ������( Ŭ���� �̸��� ������ �ż��� => ������)
	// ��ǲ �Ű������� ����, �����({�߰�ȣ��})�� ���� ������ => �⺻ ������ _ �⺻�����ڴ� ������ ����
	
	public double getArea() {
		return 3.14 * radius *radius;}
		

		public static void main(String[] args) {

			NN pizza = new NN();		//Circle ��ü�� �����ض�, ���۷��� �̸� pizza
			pizza.radius = 10; //������ �������� 10���� ����
			pizza.name = "�ڹ�����"; // ������ �̸��� ����
			double area = pizza.getArea(); // ������ ����(getArea()�� ȣ�� �ؼ� area������ �Ҵ�)
					
			System.out.println("������ �̸��� "+pizza.name+ "��������"+pizza.radius+"�Դϴ�.");
			System.out.println("������ ������"+pizza.getArea());
			
			
			NN donut = new NN(); // Circle ��ü ����, ���۷��� �̸� donut
			donut.radius = 2;
			donut.name = "�ڹٵ���";
			area = +donut.getArea(); // ������ �տ� double �ٴµ� ���� �� �Ⱥ��� ?>   �ٷ� ������ ����Ǿ �Ƚᵵ �ȴٰ���
			
			System.out.println("������ �̸��� "+donut.name+ "��������"+donut.radius+"�Դϴ�.");
			System.out.println("������ ������" +donut.getArea());
			
			
			
		}

	}
//����� Ŭ���� �ΰ� 
	

