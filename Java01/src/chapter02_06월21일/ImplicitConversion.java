package chapter02_06��21��;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;   
		int iNum = bNum;  
		
		System.out.println(bNum);  // byte �� 1byte  
		System.out.println(iNum);  // int  �� 4byte  
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);   
		// int��  4byte  ������ ������ ����
		System.out.println(fNum);   
		// float�� 4byte  �Ǽ��� ������ ���� SO �ڿ� .0 �پ���
		
		double dNum;
		dNum = fNum + iNum;   
		// float(20.0)���� + int(10)���� = double �������� ���
		// �� ������ ������ �� ������ ���� ���ԵǴ� ��� or ���� �� ���� ū ���� 
		System.out.println(dNum);
		
	}

}
