package woobin;

import java.util.Scanner;

	public class Test_13 {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			int [] intArray = {50000, 10000, 1000, 500, 100, 50, 10, 1};
			System.out.print("금액 입력 >>   ");
			
			int money = scanner.nextInt();
			
			for(int i=0; i<intArray.length; i++) {
	//			System.out.println(intArray[i] + "원 : " + money / intArray[i] +" 개");
				System.out.printf("%d 원짜리 : %d개 \n" , intArray[i] , money/intArray[i]);
				
				money -= intArray[i] * (money / intArray[i]);
			}
			
			scanner.close();
		}
	}
