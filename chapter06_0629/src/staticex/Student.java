package staticex;

public class Student {
	
	public static int serialNum = 1000;
	//Ŭ���� ����(=static����) ��� �ν��Ͽ��� ���� < == ����Ÿ������ ����
	//���α׷��� �ε�� �� ������ ������ ����
	
	// �Ʒ��� ������ �������(=�ν��Ͻ�����)  < == �������� ����
	// new Ű���带 ���ؼ� �ν��Ͻ� �����ÿ� ����    Student student = new Student();
	// ������ �÷��Ϳ� ���ؼ� ���� 
	// �� �ν��Ͻ� �������� ���� ����,
	int studentId; 
	String studentName;
	int grade;
	String address;
	
	
	  public String getStudentName() { 
		  return studentName; 
		  } 
	  
	  public void setStudentName(String name) { 
		  studentName =name; 
		  }
	 
	  public static int getSerialNum() {
		  return serialNum;
	  	}
	  public static void setSerialNum(int serialNum) {
		
	}
}
