package O624;

import java.util.Scanner;

public class Q1_Scanner_bin {
	public static void main(String[] args) {
		int num1 =10;
		int num2 =2;
		
		Scanner scanner = new Scanner(System.in);  
		//�� ��ĳ�� ��ü ���� �ҹ���s�� �����ϴ� scanner�� ���Ƿ� �ӷ� ���� 
		
		System.out.println("�����ȣ�� �Է��ϼ���.");
		
		char operator =scanner.next().charAt(0);
		
		if(operator=='+') 
			System.out.println(num1+num2);
		
		else if(operator=='-') 
			System.out.println(num1-num2);
		
		else if(operator=='*') 
			System.out.println(num1*num2);
		
		else if(operator=='/') 
			System.out.println(num1/num2);
		
		else 
			System.out.println("���� ���� ��ȣ �Դϴ�.");
					
		scanner.close();
		
		}
	}

