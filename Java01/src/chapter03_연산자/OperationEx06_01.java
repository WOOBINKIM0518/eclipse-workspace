// �� �� �� �� ��� ���� ��� ��� ���� ���̴� 

package chapter03_������;

public class OperationEx06_01 {

	public static void main(String[] args) {

		int num1 =10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0 ); //  T  T�� �� ��� True �϶� True
		System.out.println(flag);
		
		boolean flag2 = (num1 > 0) && (num2 < 0 );//  T  F
		System.out.println(flag2);
		
		boolean flag3 = (num1 < 0) && (num2 > 0 );// F  T
		System.out.println(flag3);
		
		boolean flag4 = (num1 < 0) && (num2 < 0 );// F  F
		System.out.println(flag4);
		
		
		
	}

}
