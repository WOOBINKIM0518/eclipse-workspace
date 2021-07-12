package chapter05_객체지향;

public class Student_Test { // 메서드 변수들
	int studentID;  // (학번이여서 정수형으로 정의)
	String studentName; // 문자열
	int grade;
	String address;

	
	public void showStudentInfo() {  //메서드 적용, 메서드 명은 void // 괄호 안은 매개변
		System.out.println(studentName + "," + address);
	}
	
	
	public static int add(int n1, int n2) {
		int result = n1 + n2 ;
		return result;
	}
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2= 20;
		
		int sum = add (num1 , num2) ;
				
		System.out.println(num1+ "+"+num2 +"=" + sum + " 입니다.");
	}
}
