package REVIEW;

import java.util.Scanner;

public class Review_06_�����հ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ������ �Է��Ͻÿ�.(0~100)  ");
		int score = sc.nextInt();

		System.out.print("����� �г��� �Է��Ͻÿ�.(1~4)  ");
		int year = sc.nextInt();
		
		
		if(score >=60){
			if(year !=4) {
				System.out.println("�հ��Դϴ�.");}
			
			else if (score>=70) {
				System.out.println("�հ��Դϴ�.");}
			
			else {
				System.out.println("���հ� �Դϴ�.");}}
			
		else 
			System.out.println("���հ� �Դϴ�.");
			
			
		sc.close();
	
	//  ��̴� ���� _ if-else ������ �߰�ȣ�� ������ ���� ������ �ظ��ϸ� ���� ���� ��α��
		// ���� ������ ���̶�� ������ ��Ʈ ���� ���Ѿ��� 
	}
}