package exam;

import java.util.Scanner;

public class Test6 {
	
	
	public static void main(String[] args) {
		int money;
		int arr[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력 하세요 >>>  ");
		money = sc.nextInt();
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]+"원 짜리 : "+ money/arr[i]+ " 개");
			money -= arr[i]*(money/arr[i]);
			
		}sc.close();
	}

}
