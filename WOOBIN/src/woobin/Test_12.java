package woobin;

import java.util.Scanner;

public class Test_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[10];
		
		System.out.println("��� 10���� �Է��ϼ��� >> ");
		for(int i = 0 ; i<intArray.length ;i++) {
			intArray[i] = sc.nextInt();}
		
		System.out.println("3�� ����� ? ");
		
		for(int i = 0 ; i<10 ; i++) {
			if(intArray[i]%3 !=0) {
				continue;
			}
			System.out.print(intArray[i]+"  " );
		}
		
		sc.close();
		
	}
	
}
