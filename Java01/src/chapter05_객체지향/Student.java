package chapter05_��ü����;

public class Student {  // ��ü(Ŭ����)�� ���(�޼���)�� �ִ´�

	int studentID;
	String studentName;
	int grade;
	String address;				//�������  Student ��ü�� �Ӽ�(����)
	
	
	// �ؿ� ǥ�� �κб��� �޼���
	public void showStudentInfo() {
			System.out.println(studentName + ","+ address); // �̸� , �ּ� ��� �ϴ� �޼ҵ� (= �Լ�)
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name; 
}
	// ���� ���� �޼���
	
	
	public static void main(String[] args) {

		Student studentAhn = new Student();
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);			// �ٷ��� ��ü�� ������� �־ ���
		System.out.println(studentAhn.getStudentName());	//����  �޼��带 ȣ��
	}

}
