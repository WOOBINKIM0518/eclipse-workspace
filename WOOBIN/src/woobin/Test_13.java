package woobin;

import java.util.Scanner;

	public class Test_13 {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			int [] intArray = {50000, 10000, 1000, 500, 100, 50, 10, 1};
			System.out.print("�ݾ� �Է� >>   ");
			
			int money = scanner.nextInt();
			
			for(int i=0; i<intArray.length; i++) {
	//			System.out.println(intArray[i] + "�� : " + money / intArray[i] +" ��");
				System.out.printf("%d ��¥�� : %d�� \n" , intArray[i] , money/intArray[i]);
				
				money -= intArray[i] * (money / intArray[i]);
			}
			
			scanner.close();
		}
	}
