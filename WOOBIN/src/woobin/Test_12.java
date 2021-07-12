package woobin;

import java.util.Scanner;

public class Test_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[10];
		
		System.out.println("양수 10개를 입력하세요 >> ");
		for(int i = 0 ; i<intArray.length ;i++) {
			intArray[i] = sc.nextInt();}
		
		System.out.println("3의 배수는 ? ");
		
		for(int i = 0 ; i<10 ; i++) {
			if(intArray[i]%3 !=0) {
				continue;
			}
			System.out.print(intArray[i]+"  " );
		}
		
		sc.close();
		
	}
	
}
