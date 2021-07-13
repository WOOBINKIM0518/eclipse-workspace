package p337;

public class MyClassTest {

	public static void main(String[] args) {

		MyClass mClass = new MyClass();
		
		X xClass =mClass;		// x 타입으로 업캐스팅
		xClass.x();
		
		Y yClass =mClass;		// y 타입으로 업캐스팅
		yClass.y();
		
		MyInterface iClass = mClass; //MyInterface 로 업캐스팅
		iClass.MyMethod();
		iClass.x();
		iClass.y();
		
		
	}

}
