package Ex_0723;

import java.util.Scanner;

public class Ex11_DivideByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.print("�������� �Է��Ͻÿ� : ");
		dividend = sc.nextInt(); // ������ �Է�
		System.out.print("�������� �Է����ÿ� : ");
		divisor = sc.nextInt(); //������ �Է�
		System.out.println(dividend +  " �� " + divisor + "�� ������ ����" + dividend/divisor+"�Դϴ�.");
		sc.close();
	}

}
