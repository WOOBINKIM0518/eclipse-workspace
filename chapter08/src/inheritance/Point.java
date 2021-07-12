package inheritance;

public class Point {
	
	protected int x,y;
	
	public void set(int x, int y) { // 좌표를 나타내는 변수.
		this.x =x;					// protected : default 접근 제한자와 동일
		this.y =y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
