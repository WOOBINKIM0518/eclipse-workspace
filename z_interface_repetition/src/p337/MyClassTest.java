package p337;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		
		X xClass =mClass;		// x Ÿ������ ��ĳ����
		xClass.x();
		
		Y yClass =mClass;		// y Ÿ������ ��ĳ����
		yClass.y();
		
		MyInterface iClass = mClass; //MyInterface �� ��ĳ����
		iClass.MyMethod();
		iClass.x();
		iClass.y();
		
		
	}

}
