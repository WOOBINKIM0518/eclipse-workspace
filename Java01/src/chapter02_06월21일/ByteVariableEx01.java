// ������ �ڷ��� ! 


//  byte     short     int:���� �ڷ����� �⺻��    long   : �������� L �Է�(�ƴϸ� int������ �ν�)

package chapter02_06��21��;

public class ByteVariableEx01 {

	public static void main(String[] args) {

		byte num;        	// byte : 1byte (-2^7  ~ 2^7-1) , ( -128 ~ 127) �Ҵ簡��
		num = -128;
		
		byte num2;
		num2 = 127;      // 128������ ������  Type mismatch 
		
		short num3 = -32768;   //short : 2byte (-2^15  ~ 2^15-1) , ( -32,768 ~ 32,767) �Ҵ簡��
		short num4 = 32767;
		
		int num5 = -2147483648; 
		//int : 4byte (-2^31  ~ 2^31-1) , ( -2,147,483,648 ~ 2,147,483,647) �Ҵ簡��
		int num6 = 2147483647;
		//short num7 =123456789;   ��� �� �� ���� �Ѿ 
		
		long num7 = -9223372036854775808L;    
		long num8 = 9223372036854775807L; //long : 8byte (-2^63  ~ 2^63-1)  
				// -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 �Ҵ簡��
		
		// long���� �ڿ�  L�� �ٿ��ֿ����� why ���������� �ν���
		//(�ҹ��ڵ� ������� but 1�� �򰥷��� �빮�ڸ� ���� ��)
		
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);

		

	}

}
