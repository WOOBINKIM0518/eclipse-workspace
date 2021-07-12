package chapter04_조건문;

public class If_Exam02 {

	public static void main(String[] args) {

		int score = 95;
		char grade;
		
		if ( score >= 90) {
			
			grade = 'A';
		}
		else if ( score >= 80) {
			
			grade = 'B';
		}
		else if ( score >= 70) {
			
			grade = 'C';
		}
		else if ( score >= 60) {
			
			grade = 'D';
		}
		
		else{
			
			grade = 'F';
		}

		System.out.println("당신의 점수는 " + score + " 입니다.   " +"학점은 "+ grade + " 입니다");

		}

}
