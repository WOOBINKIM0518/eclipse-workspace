package test0702_alonge;

import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int Arr[] = new int[5];
		
		System.out.println("양수 5개를 입력해 주세요");
		
		for(int i =0 ; i< Arr.length; i++) {
			Arr[i] = sc.nextInt();
			
			if(Arr[i]>max)
				max = Arr[i];			
		}
		System.out.println("최대값은 " + max);
		
		sc.close();
	}

}
