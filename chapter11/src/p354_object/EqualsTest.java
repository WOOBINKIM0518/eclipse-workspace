package p354_object;


class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {		//Student 객체가 Objec 업캐스팅.
		
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
		return studentId;				//해쉬 코드 값으로 학번을 반환 하도록 매서드 정의
	}
	
/*	public String toString() {
		return studentId+","+studentName;
	}*/
	
		
	}



public class EqualsTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");	//인스턴스가 생성
		Student studentLee2 = studentLee;					//주소만 복사
		Student studentSang = new Student(100,"이상원");		// 별개의 인스턴스 생성
		
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2의 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2의 동일하지 않습니다.");
		
		
		
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang의 동일합니다.");
		else
			System.out.println("studentLee와 studentSang의 동일하지 않습니다.");
		
		
		System.out.println("================================");
		System.out.println("studentLee : "+ studentLee);
		System.out.println("studentLee2 : "+ studentLee2);
		System.out.println("studentSang : "+ studentSang);
		
		System.out.println("==========[hashCode]============");
		System.out.println(studentLee.hashCode());
		System.out.println(studentSang.hashCode());
		
		System.out.println("==========[실제주소]===============");
		System.out.println(System.identityHashCode(studentLee));
		System.out.println(System.identityHashCode(studentSang));
		
	}

}
