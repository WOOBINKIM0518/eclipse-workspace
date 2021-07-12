package inheritance4;


/*public*/	class A { // 한 class 안에 한 public
				public A() {
			System.out.println("생성자 A");	}}

			class B extends A{// 상속관계 정의되어 있을 때 super생략되어 있음
				public B() {
				super();			
				System.out.println("생성자 B");}}

			class C extends B {  // 상속관계 정의되어 있을 때 super생략되어 있음
				public C() {
					super(); // 상위클래스의 생성자 호출 , 
			//생성자 내에 상속관계에 있을 때// 생성자 바로 첫 다음라인에 기재야함
//super : 슈퍼클래스(부모클래스), 부모클래스의 생성자 호출, 반드시 첫번째 라인
				System.out.println("생성자 C");	}}

public class ConstructorEx02 {

	public static void main(String[] args) {
		
		C c ; 
		c = new C();

	}

}
