package chapter04_���ǹ�;

public class Loop_While_Example {

	public static void main(String[] args) {

		int num = 1;		//num :  1~10���� ���� ����
		int sum = 0;		//sum :  ���� ����� ���� ����
		
		// num = 20�� ��� ���ǽ��� False �̱� ������ 
		// �Ʒ� ������ ���� ��Ű�� �ʴ´�.
		// sum = 0 // num = 20
		
		while(num<=10){  // ������ �����ϸ� �ȿ� ���� ����   // �����̸� ���� ����
			sum +=num; // sum = sum + num
			num++; // num �� 1�� ����(= �ø�)
			// sum = sum + num
			//  1   =  0 +  1     <== Loop 1
			//  3   =  1 +  2     <== Loop 2
			//  6   =  3 +  3     <== Loop 3
			//  10  =  6 +  4     <== Loop 4
			//  15  =  10 + 5     <== Loop 5
			//  21  =  15 + 6     <== Loop 6
			//  28  =  21 + 7     <== Loop 7
			//  36  =  28 + 8     <== Loop 8
			//  45  =  36 + 9     <== Loop 9
			//  55  =  45 + 10    <== Loop 10
			//  num  = 11   < == False _ While �������ͼ� ���� ��ɾ� ����
			
			
			
		}
		System.out.println("1���� 10������ ���� " + sum + " �Դϴ�");
		System.out.println("sum : "+ sum);
		System.out.println("num : "+ num);
	
	}

}
