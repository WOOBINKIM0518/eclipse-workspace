package REVIEW;

import java.util.Scanner;

public class Review_04_3�ǹ�� {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" ������ �Է� �ϼ��� ");
		
		int num = sc.nextInt();
		
		if (num%3==0) {
			System.out.println(" 3�� ��� �Դϴ�.");
		}
		
		else {
			System.out.println("3�� ����� �ƴմϴ�.");
		}
		
		sc.close();
	}
}
