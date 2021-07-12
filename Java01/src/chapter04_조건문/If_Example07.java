// IF 조건문을  조건이 한가지 인 경우 조건 연산자로 식을 간단하게 정의 할 수 있다. 
package chapter04_조건문;

public class If_Example07 {

	public static void main(String[] args) {

		int score = 70;
		char grade ;
		
		grade = ( score >= 90) ? 'A' : 'B';
			
		System.out.println("당신의 점수는 " + score + " 입니다.  "+ "당신의 학점은 "+grade+" 입니다.");
	}

}
