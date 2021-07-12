// 06월 22일 (화) 산술 연산자(=사칙연산)

package chapter03_연산자;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		int mathScore = 95;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("토탈 점수 : " + totalScore);
				
	
		// int avgScore = (mathScore + engScore) /2; 정수형 소수점 버림
		double avgScore = (mathScore + engScore) /2.0; 
		// 소수점까지 정확하게 하려면 자료형 double사용  2.0으로 기재  (2로 기재하면 나머지 출력안됨)
		System.out.println("평균 점수 : " + avgScore);
		
		
		
		int mod = mathScore % engScore;
		String ch1 = "나눈 나머지값 : ";  // String은 객체형데이터 타입이다 . 
		System.out.println(ch1 + mod);
	}
}
