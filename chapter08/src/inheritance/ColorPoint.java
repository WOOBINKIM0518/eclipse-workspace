package inheritance;

public class ColorPoint extends Point{

	private String color ;
	
	// public ColorPoint(){}  <- 실행부 없는 기본생성자 생략되어있다.
		//super();   < - 키워드 생략되어 있음 
	
	public void setColor(String color) {
		this.color= color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
	/*
	 * public static void main(String[] args) { Point p = new Point();
	 * 
	 * p.x =1; p.y =2;
	 * 
	 * }
	 */
}
