package p400generics;

public class GenericMethod {		//일반클래스, static을 사용 : 클래스이름으로 호출
	
	
	public static <T,V> double makeRectangle(Point<T, V>p1, Point <T, V>p2) {
		
		double left = ((Number)p1.getX()).doubleValue();
		
					//(Number)p1.getX()  <==객체형을 숫자로 변환
					//((Number)p1.getX()).doubleValue(); : 더블형식으로 변환
		
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom = ((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMethod.<Integer, Double>makeRectangle(p1,p2);
					//
		
	//	Collection
		System.out.println("두 점으로 만들어진 사각형의 넓이는 "+rect+ "입니다.");
	}
}
