package inheritance;

public class ColorPointEx {

	public static void main(String[] args) {
		
		Point p =new Point();  // Point 클래스의 객체 생성

		p.set(1, 2);;
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); // Colorpoint객체
		cp.set(3, 4);						// cp.set 은 상위 클래스의 매서드
		cp.setColor("red");					 
		cp.showColorPoint();
		
	}
}
