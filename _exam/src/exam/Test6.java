package exam;

import java.util.Scanner;

public class Test6 {
	
	
	public static void main(String[] args) {
		int money;
		int arr[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է� �ϼ��� >>>  ");
		money = sc.nextInt();
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]+"�� ¥�� : "+ money/arr[i]+ " ��");
			money -= arr[i]*(money/arr[i]);
			
		}sc.close();
	}

}