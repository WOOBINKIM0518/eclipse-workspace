package chapter04_조건문;

public class Loop_For_Continume_Ex01 {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		
		for ( num=1; num <=100; num++) {
// 		for (int total = 0; int num=1; num<=100; num++) 라고 표현 할수도 있다
//	    but for문 안에서 선언하면 for문 안에서만 작동됨
			
			if(num%2 == 0) 
//			 2로 나누었을 때 영인것은 짝수 ->찍수 일 때는 continue 즉 아래 식 실행하지 말아라
				continue;
			
			total += num; // total = totla + num
			System.out.println(total);
		}
		
		System.out.println("1부터 100까지의 홀수의 합은"+total+"입니다.");
	}

}
