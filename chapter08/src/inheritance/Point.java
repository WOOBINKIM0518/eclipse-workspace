package inheritance;

public class Point {
	
	protected int x,y;
	
	public void set(int x, int y) { // ��ǥ�� ��Ÿ���� ����.
		this.x =x;					// protected : default ���� �����ڿ� ����
		this.y =y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
