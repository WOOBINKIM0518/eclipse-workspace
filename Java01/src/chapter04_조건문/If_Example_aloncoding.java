// 조건문  else if  점수 한번 나오고 정리

package chapter04_조건문;

public class If_Example_aloncoding {

	public static void main(String[] args) {

		int score = 50;
		char grade;
		
		if ( score >= 90 ) {
				grade = 'A';
				System.out.println(score+ " 점");  
		}
		else if (score >=80 ) { 
				grade = 'B';
				System.out.println(score+ " 점");			
		}
		else if (score >=70) {
				grade = 'C';
				System.out.println(score+ " 점");
		}
		else if (score >=60) {
				grade = 'D';
				System.out.println(score+ " 점");
		}
		else {  
				grade = 'F';
				System.out.println(score+ " 점");
		}
		
		System.out.println("학점은 " + grade + " 입니다");
	}

}
