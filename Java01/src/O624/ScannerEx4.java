package O624;

import java.util.Scanner;

public class ScannerEx4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scanner.nextInt();
		if(score>=80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		
		else 
			System.out.println("��ž������, ���հ��Դϴ�.");
		
		scanner.close();
	
	}
}
