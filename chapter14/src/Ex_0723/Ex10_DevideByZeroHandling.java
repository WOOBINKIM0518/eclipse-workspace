package Ex_0723;

import java.util.Scanner;

public class Ex10_DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		int dividend = sc.nextInt(); // ������ �Է�
		System.out.print("�������� �Է����ÿ� : ");
		int divisor = sc.nextInt(); //������ �Է�
		try {
		System.out.println(dividend +  " �� " + divisor + "�� ������ ����" + dividend/divisor+"�Դϴ�.");
		break; // �������� ������ �Ϸ� �� while �����
		}
		catch(ArithmeticException e) { //ArithmeticException ����ó�� �ڵ�
			
			//System.out.println(e);
			System.out.println("0���� ���� �� �����ϴ�. ! �ٽ��Է��ϼ���.");
			
			}
		}
		sc.close();
	}

}
