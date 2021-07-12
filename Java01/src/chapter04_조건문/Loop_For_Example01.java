package chapter04_조건문;

public class Loop_For_Example01 {

	public static void main(String[] args) {
		
		int i;
		int sum;
		for (i=0,sum=0; i <10 ; i++) { // i=0 부터 시작 why ? 배열에서 0부터 시작
			sum += (i+1);  // sum = sum + (i+1)
		
			System.out.println(sum);
			
		
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
		
	}
}
