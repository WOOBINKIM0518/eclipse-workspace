package override2;

class Shape2 {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Shape");
	}
}
public class Circle extends Shape2 {

	@Override  // ������̼�(Annotation)    _ ��ܿ� draw��� �޼ҵ� �ؿ� draw�� ������ 
	public void draw() {				//��,�Ʒ��� �Ű����� �ڷ��� ���ƾ���
		
		System.out.println("Circle");
	}
	public static void main(String[] args) {
		Shape2 b = new Circle();
		b.paint();
	}

}
