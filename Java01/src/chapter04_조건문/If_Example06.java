//조건문
package chapter04_조건문;

public class If_Example06 {

	public static void main(String[] args) {

		int score = 70;
		char grade ;
		
		if ( score >= 90 ) {
			grade = 'A';
		}
		else {
			grade ='B';
		}
		System.out.println("당신의 점수는 " + score + " 입니다.  "+ "당신의 학점은 "+grade+" 입니다.");
		
	}

}
