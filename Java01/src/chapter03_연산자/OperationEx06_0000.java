// �ܶ� ȸ�� �� �� �� && ����� 

package chapter03_������;

public class OperationEx06_0000 {

	public static void main(String[] args) {


		int num1 = 10;
		int i = 2;
		
		boolean value =((num1 = num1+10)<10) && ((i = i+2)<10); 
		// �� ������ �� ���� ������� �����̹Ƿ� �� ������ ������� ����
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		
		int num2 = 5;
		int j = 3;
				
		boolean value2 =((num2 = num2+10)<25) && ((j = j+2)<3); 
		
		
		System.out.println(value2);  // True
		System.out.println(num2);  //  15
		System.out.println(j);      // 5

		
		// ���� ! �� ������ ������ ��� ���̸� �� ���� ���� �ϴ±��� ! 
		// �� �� ���̰� ���� �����̶�� ? ==> �׷��� ��� �Ǵ±��� but �Ҹ��� ���� False
		
		/*
		 * �ܶ� ȸ�� �� �� �� ���� 
		 * 
		 * �� ��            �� �� 
		 * T / ���     T ������� ���   boolean ��� True 
		 *             F ������� ���   boolean ��� False 
		 *             
		 *  �� ��            �� ��
		 * F / ���      T ������� ���x boolean ��� False 
		 *              F ������� ���x boolean ��� False
		 */
	}

}
