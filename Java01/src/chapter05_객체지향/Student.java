package chapter05_객체지향;

public class Student {  // 객체(클래스)에 기능(메서드)을 넣는다

	int studentID;
	String studentName;
	int grade;
	String address;				//멤버변수  Student 객체의 속성(변수)
	
	
	// 밑에 표시 부분까지 메서드
	public void showStudentInfo() {
			System.out.println(studentName + ","+ address); // 이름 , 주소 출력 하는 메소드 (= 함수)
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name; 
}
	// 여기 까지 메서드
	
	
	public static void main(String[] args) {

		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);			// 바로위 객체에 멤버변수 넣어서 출력
		System.out.println(studentAhn.getStudentName());	//위에  메서드를 호출
	}

}
