package O624;

public class Q1_If {
	public static void main(String[] args) {
	
		int num1 =10;
		int num2 =2;
		char operator = '1';
		
		int result = 0;
		
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
			return; // ���� ���ϸ� �Ʒ� "��� ���� 0 �Դϴ�." ��(��) ��µ� 
		}
		System.out.println("��� ���� "+ result + " �Դϴ�.");
		}
	}

