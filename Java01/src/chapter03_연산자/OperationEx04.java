//06월 22일 (화) 증가/감소 연산자를 사용하여 값 연산하기 p.75

package chapter03_연산자;

public class OperationEx04 {

	public static void main(String[] args) {

		int gameScore = 150;
		
		
		  int lastScore1 = ++gameScore;   // ; 처리 전에 적용
		  System.out.println(lastScore1);  // 151
		 
		
		System.out.println(lastScore1);    //151
		System.out.println(gameScore);     //151
		
		int lastScore2 = gameScore--;
		System.out.println(lastScore2);    //151
		System.out.println(gameScore);     //150
		
	}

}
