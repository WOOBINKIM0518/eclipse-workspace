package inheritance2;

public class inheritanceEx {

	public static void main(String[] args) {

		Student s = new Student();  // ��ü ����
		s.set();  // Student �޼��� ȣ��
		
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.getWeight()); // privatye , getter�� ���ؼ� ������ �� ���
		System.out.println(s.heigth);
	}

}