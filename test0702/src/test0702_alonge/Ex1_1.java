package test0702_alonge;

import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int Arr[] = new int[5];
		
		System.out.println("��� 5���� �Է��� �ּ���");
		
		for(int i =0 ; i< Arr.length; i++) {
			Arr[i] = sc.nextInt();
			
			if(Arr[i]>max)
				max = Arr[i];			
		}
		System.out.println("�ִ밪�� " + max);
		
		sc.close();
	}

}
