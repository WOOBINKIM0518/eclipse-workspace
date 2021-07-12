package hiding;

public class StuedntTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = " 이상원";
			//레퍼런스 변수에 직접 할당
		
		studentLee.setStudentName("이상원");
		// Setter를 통해서 할당.
		System.out.println(studentLee.getStudentName());
	}
}
