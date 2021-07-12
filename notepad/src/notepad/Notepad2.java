package notepad;

public class Notepad2 {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + " ," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static void main(String[] args) {
		
		Notepad2 studentLee = new Notepad2();
		studentLee.studentName="이순신";
		studentLee.studentID =100;
		studentLee.address = "서울시 영등포구 여의도동";
				
				
		Notepad2 studentKim = new Notepad2();
		studentKim.studentName="김유신";
		studentKim.studentID =101;
		studentKim.address = " 서울시 영등포구 당산동";

		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		 
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
