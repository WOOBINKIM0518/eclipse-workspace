package p354_object;


class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {		//Student ��ü�� Objec ��ĳ����.
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentId == std.studentId)
				return true;
			else
				return false;}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;				//�ؽ� �ڵ� ������ �й��� ��ȯ �ϵ��� �ż��� ����
	}
	
/*	public String toString() {
		return studentId+","+studentName;
	}*/
	
		
	}



public class EqualsTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "�̻��");	//�ν��Ͻ��� ����
		Student studentLee2 = studentLee;					//�ּҸ� ����
		Student studentSang = new Student(100,"�̻��");		// ������ �ν��Ͻ� ����
		
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		
		
		
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		
		
		System.out.println("================================");
		System.out.println("studentLee : "+ studentLee);
		System.out.println("studentLee2 : "+ studentLee2);
		System.out.println("studentSang : "+ studentSang);
		
		System.out.println("==========[hashCode]============");
		System.out.println(studentLee.hashCode());
		System.out.println(studentSang.hashCode());
		
		System.out.println("==========[�����ּ�]===============");
		System.out.println(System.identityHashCode(studentLee));
		System.out.println(System.identityHashCode(studentSang));
		
	}

}
