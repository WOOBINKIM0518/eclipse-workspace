package hiding;

public class StuedntTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = " �̻��";
			//���۷��� ������ ���� �Ҵ�
		
		studentLee.setStudentName("�̻��");
		// Setter�� ���ؼ� �Ҵ�.
		System.out.println(studentLee.getStudentName());
	}
}
