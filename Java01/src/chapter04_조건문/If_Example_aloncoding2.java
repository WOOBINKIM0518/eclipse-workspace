// 조건문  else if  학점 바로 정리

package chapter04_조건문;

public class If_Example_aloncoding2 {

	public static void main(String[] args) {

		int score = 97;
		char grade;
		
		if ( score >= 90 ) {
				grade = 'A';
				// else가 없으면 맨 밑으로 빠지는 것이 아니라 바로 밑 if로 진행
		}
		else if (score >=80 ) { // if의 조건이 아닐때 else if 다시 조건을 넣어주어야 함
				grade = 'B';
		}
		else if (score >=70) {
				grade = 'C';
		}
		else if (score >=60) {
				grade = 'D';
	}
		else {  // 마지막은 else_ 위 모든경우가 아닌 경우 이기 때문에 별도 조건 입력하지 않는다.
				grade = 'F';
		}
		
		System.out.println("당신의 점수는 " + score + " 입니다." );
		System.out.println("학점은 "+ grade + " 입니다");
	}

}
