package chapter04_조건문;

public class Loop_For_Example02 {

	public static void main(String[] args) {
		
		int i;
		int sum;
		
		for (i=1 , sum=0 ; i <=100 ; i++) { //  초기화식 ; 조건식  ; 증감식 
		sum += i;  //;  == sum = sum + i
		}
	
	
		
		System.out.println("1부터 10까지의 합은 " + sum + " 입니다.");
		
	}
}
