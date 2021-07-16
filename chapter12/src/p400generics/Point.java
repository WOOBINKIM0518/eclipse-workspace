package p400generics;

public class Point<T, V> {		//제너릭 클래스 . static  못씀
	
	T x;		// x :  객체(인스턴스 변수)
	V y;		// y :  객체(인스턴스 변수)
	
	Point (T x,V y){			//생성자에서 x,y
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}



}
