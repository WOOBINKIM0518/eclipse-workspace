package O624;

import java.util.Scanner;

public class ScannerEx8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� Ŀ�Ƿ� �帱 ���?");
		String coffee = scanner.next();
		
		switch(coffee) {
		case "����������" : case "īǪġ��" : case "ī���" :
			System.out.println("3,500�� �Դϴ�.");
		break;
		case "�Ƹ޸�ī��" : 
			System.out.println("2,000�� �Դϴ�");
		break;	
		default :
			System.out.println("���� Ŀ�� �Դϴ�.");
		
		scanner.close();
		}
	}
}
