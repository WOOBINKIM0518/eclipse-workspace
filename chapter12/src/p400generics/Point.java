package p400generics;

public class Point<T, V> {		//���ʸ� Ŭ���� . static  ����
	
	T x;		// x :  ��ü(�ν��Ͻ� ����)
	V y;		// y :  ��ü(�ν��Ͻ� ����)
	
	Point (T x,V y){			//�����ڿ��� x,y
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
