package O624;

import java.util.Scanner;

public class Q1_Scanner_teacher01 {
	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);  
		// Ŀ���� Scanner �տ� �ΰ� Ctrl + Shift + O ������ �ڵ����� ����Ʈ
		//�� ��ĳ�� ��ü ���� �ҹ���s�� �����ϴ� scanner�� ���Ƿ� �ӷ� ���� 
		
		System.out.println("�����ڸ� �Է� �ϼ���. ex) +,-,*,/");
		String S = scanner.next();	// ���ڿ��� �޾Ƽ� S������ �Ҵ�
		char operator = S.charAt(0); // ù��° ���ڸ� char ���� operator�� ����
		
		if(operator=='+') {
			result = num1 + num2;
		}
		else if(operator=='-') {
			result = num1 - num2;
		}
		else if(operator=='*') {
			result = num1 + num2;
		}
		else if(operator=='*') {
			result = num1 + num2;
		}
		else if(operator=='/') {
			result = num1 / num2;
		}
		else {
			System.out.println("������ �����Դϴ�.");
			scanner.close();
			return; // ���� ���ϸ� �Ʒ� "��� ���� 0 �Դϴ�." ��(��) ��µ� 
		}
		System.out.println("��� ���� "+ result + " �Դϴ�.");
		
		scanner.close();
		}
	}

