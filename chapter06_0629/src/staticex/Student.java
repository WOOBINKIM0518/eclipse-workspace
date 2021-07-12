package staticex;

public class Student {
	
	public static int serialNum = 1000;
	//클래스 변수(=static변수) 모든 인스턴에서 접근 < == 데이타영역에 생성
	//프로그램이 로드될 때 데이터 영영에 저장
	
	// 아래의 변수는 멤버변수(=인스턴스변수)  < == 힙영역에 생성
	// new 키워드를 통해서 인스턴스 생성시에 생성    Student student = new Student();
	// 가비지 컬렉터에 의해서 제거 
	// 그 인스턴스 내에서만 공유 사용됨,
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
