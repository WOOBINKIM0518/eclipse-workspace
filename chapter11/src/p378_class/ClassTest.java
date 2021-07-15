package p378_class;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());	/*Class Ŭ������ getName�޼ҵ�
												Class�� ��ü�̸�(��Ű���̸�.Ŭ�����̸�)*/
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		/*
			���� �ε� : ������ �ܰ迡�� üũ, ����
			���� �ε��� ���� Ŭ���� �̸��� �������Ѵ�. 
			�����Ϸ��� ������ �ܰ迡�� üũ���� �ʰ� ����� �� üũ 
			���� ���ε� : ��ĳ���õ� �޼ҵ带 ȣ���� ��� ���� ��ü�� �����ǵ� �޼ҵ�� ���ε�
		*/
		
		Class pClass3 = Class.forName("p378_class.Person");		//�����ε���;
		System.out.println(pClass3.getName());
		
	}

}
