// �ܶ� ȸ�� �� �� , �� �� ����

package chapter03_������;

public class OperationEx06_00 {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;
		
		boolean value =((num1 = num1+10)<10) && ((i = i+2)<10); 
		// �� ������ �� ���� ������� �����̹Ƿ� �� ������ ������� ����
		
		System.out.println(value); // False
		System.out.println(num1); // 20
		System.out.println(i);  //2 
		
		
		//  num = 20
		//   i  = 2
		
		value = ((num1 = num1+10)>0) || ((i = i+2)<10);
		// �� �տ��� �� ���� ��� ���� ���̹Ƿ� �� ������ ������� ����
		
		System.out.println(value);  // True 
		System.out.println(num1);  // 20�� �ƴϰ� �� 30?  ������ �̾���
		System.out.println(i);    // 2
		
		
		// ����  : �� �� && �� ��� ����  - > �� �� ���� X   �� ���� �̸� boolean False
		//	  	  �� �� || �� ��� ��   ->  �� �� ���� X	  �� �� �̸� boolean True
	}

}
