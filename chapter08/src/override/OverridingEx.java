package override;

class Shape {			//슈퍼 클래스
	public Shape next;
	public Shape () {next = null;}
	
	public void draw() {
		System.out.println("Shap");
	}}

class Line extends Shape{
	public void draw () {				//메소드 재정의 ( 메소드 오버 라이딩)
		System.out.println("Line");
	}}

class Rect extends Shape{
	public void draw() {				//메소드 오버라이딩
		System.out.println("Rext");
	}}

class Circle extends Shape {
	public void draw () {				//메소드 오버라이딩
		System.out.println("Circle");
	}}
public class OverridingEx{
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		Line line = new Line();		//객체생성
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}}
