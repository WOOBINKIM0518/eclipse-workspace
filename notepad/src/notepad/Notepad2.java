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
		studentLee.studentName="�̼���";
		studentLee.studentID =100;
		studentLee.address = "����� �������� ���ǵ���";
				
				
		Notepad2 studentKim = new Notepad2();
		studentKim.studentName="������";
		studentKim.studentID =101;
		studentKim.address = " ����� �������� ��굿";

		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		 
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
