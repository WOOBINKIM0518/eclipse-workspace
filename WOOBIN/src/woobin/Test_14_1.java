package woobin;

public class Test_14_1 {

	public static void main(String[] args) {

		int[] intArry = new int[10];
		int total = 0;
		double avg;
		
		for( int i = 0; i < intArry.length; i++) {
			intArry[i] = (int)(Math.random()*10+1);  // 1~10까지의 랜덤한 값을 반환
			
		}
		System.out.println("랜덤한 정수를 : ");
		
		for (int i = 0 ; i <10; i++) {
			System.out.print(intArry[i]+ " ");
			
			total += intArry[i];
		}
		
		System.out.println();
		
		avg = (double)total / intArry.length;
		System.out.println("평균은 : "+ avg);
			
	}
}
		/*
		System.out.println((double)Math.random()); 		0.xxx~0.9XXX
		System.out.println((double)Math.random()*10);  		0~9
		System.out.println((double)Math.random()*10+1); 	1~10
		System.out.println((double)Math.random()*100);	    0~99
		System.out.println((double)Math.random()*100+1);	1~100
		 */