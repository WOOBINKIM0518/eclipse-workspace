package test0702_alonge;

import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int Arr[] = new int[5];
		
		System.out.println(" ��� 5���� �Է� �ϼ��� ");
		
		for ( int i = 0 ; i < Arr.length; i++) {
			Arr[i] = sc.nextInt();
			
			sum += Arr[i];
		}
		
		System.out.println((double)sum/Arr.length);
		
	}
	

}
