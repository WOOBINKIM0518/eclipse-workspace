package inheritance4;


/*public*/	class A { // �� class �ȿ� �� public
				public A() {
			System.out.println("������ A");	}}

			class B extends A{// ��Ӱ��� ���ǵǾ� ���� �� super�����Ǿ� ����
				public B() {
				super();			
				System.out.println("������ B");}}

			class C extends B {  // ��Ӱ��� ���ǵǾ� ���� �� super�����Ǿ� ����
				public C() {
					super(); // ����Ŭ������ ������ ȣ�� , 
			//������ ���� ��Ӱ��迡 ���� ��// ������ �ٷ� ù �������ο� �������
//super : ����Ŭ����(�θ�Ŭ����), �θ�Ŭ������ ������ ȣ��, �ݵ�� ù��° ����
				System.out.println("������ C");	}}

public class ConstructorEx02 {

	public static void main(String[] args) {
		
		C c ; 
		c = new C();

	}

}