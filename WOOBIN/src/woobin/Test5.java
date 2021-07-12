package woobin;

public class Test5 {
	
	public static void main(String[] args) {
			
		int sum = 0;
		
		int[]num = new int[] {1,2,3,4,5,6,7,8,9,10}; 
		
		for(int i = 0; i<num.length; i++) {
			
			sum +=i+1;
		}
		System.out.println("1~10 까지의 합은 : " + sum);
	}
}
