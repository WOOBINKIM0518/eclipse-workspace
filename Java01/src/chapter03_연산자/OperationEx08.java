// 06�� 22�� (ȭ) ��Ʈ ������ 10�������� 2�������� ��ȯ�ϰ� �� ��ȯ�� ���� �����Ͽ� ����� ��´�.

package chapter03_������;

public class OperationEx08 {

	public static void main(String[] args) {

		int num1 = 10;  //  0B00000000000000000000000000001010
						//  0B11111111111111111111111111110101
		int num2 = 5;
		
		 		//int num1 = 0B00000000000000000000000000001010; = 0B1010 =10
				//int num2 = 0B00000000000000000000000000000101; = 0B0101  =5
//int result2 = num1 & num2; 0B00000000000000000000000000000000; = 0B0000  =0
//int result3 = num1 | num2; 0B00000000000000000000000000001111; = 0B1111 =15
//int result4 = num1 ^ num2; 0B00000000000000000000000000001111; = 0B1111 =15
		
		int bNum2 = 0B00000000000000000000000000000000; // = 0B0000 (0)
		int bNum3 = 0B00000000000000000000000000001111; // = 0B1111 (15)
		int bNum4 = 0B00000000000000000000000000001111; // = 0B1111 (15)
		
		int result1 = ~num1;   // ~ ��Ʈ�� ����
		int result2 = num1 & num2;  //��Ʈ ���� AND  �� ���� ��� 1 �̸� 1�� ���
		int result3 = num1 | num2;  //��Ʈ ���� OR   �� �߿� �ϳ��� 1�̸� 1�� ��� , �Ѵ� 0 �̸� 0
		int result4 = num1 ^ num2;  //��Ʈ ���� XOR  // �� ���� ���� �ٸ��� 1 , ������ 0
		
				
		System.out.println(result1);
		System.out.println("�� : "+result2);
		System.out.println("�� : "+result3);
		System.out.println("�� : "+result4);
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		//System.out.println(num3);
		//System.out.println(num4);
		System.out.println("�� : "+bNum2);
		System.out.println("�� : "+bNum3);
		System.out.println("�� : "+bNum4);
	}

}
