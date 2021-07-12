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

	@Override  // 어노테이션(Annotation)    _ 상단에 draw라는 메소들 밑에 draw에 재정의 
	public void draw() {				//위,아래에 매개변수 자료형 같아야함
		
		System.out.println("Circle");
	}
	public static void main(String[] args) {
		Shape2 b = new Circle();
		b.paint();
	}

}
