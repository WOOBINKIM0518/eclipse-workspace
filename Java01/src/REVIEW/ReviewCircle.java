/*
�������� �̸��� ���� Circle Ŭ������ �ۼ��ϰ�, 
Circle Ŭ������ ��ü�� �����϶�. 
�׸��� ��ü�� ������ ����� �׷�����.
*/

package REVIEW;

public class ReviewCircle {

	int radius;
	String name;
	
	public ReviewCircle() {}
	
	public double getArea() {return 3.14*radius*radius;	}
	
	public static void main(String[] args) {
		
		ReviewCircle RC = new ReviewCircle();
		
		RC.name = "����";
		RC.radius = 10;
		
		double area = RC.getArea();
				
		System.out.println("�����̸���"+RC.name+"  ����ũ���" +RC.getArea());
	}

}
