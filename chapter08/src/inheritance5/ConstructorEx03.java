package inheritance5;
class A {
	public A() {
		System.out.println("생성자 A");
	}
	public A(int x) {
		System.out.println("매개변수 생성자 A");
	}
	public A (int x , int y ) {
		System.out.println("매개변수 생성자 2개 A");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자 B");
	}
	public B(int x) {
			super();
		//supper(); 생략되어있음
		//supper(10); 생략되어있음
		System.out.println("매개변수 생성자 B");
	}
}
public class ConstructorEx03 {
	public static void main(String[] args) {
		B b;
		b = new B(5);
	}
	
}
