// �ܶ� ȸ�� �� �� �� || ����� 

package chapter03_������;

public class OperationEx06_000 {

	public static void main(String[] args) {

		int num = 5;
		int i = 10;
		
		boolean value = ((num = num *10) >45 ) || ((i = i - 5) < 10);
		// �� �� �� ����� ���̸� ���� ��� ������� �ʴ´� .
		
		System.out.println(value);  // T  T   True
		System.out.println(num);    // 50
		System.out.println(i);		// 10  �� �տ��� �տ����� ������� ���ΰ�� �ڿ� ������� ����
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		int num1 = 10;
		int j = 3;
		
		boolean value2 = ((num1 = num1 +10) > 200) || ((j = j-1) >3);
		//�� �� �� ����� �����̶��  ���� ��� ���� ��� ��� ��� �ɱ� ? 
		
		System.out.println(value2);         // False
		System.out.println(num1);			// 20
		System.out.println(j);				// 2
		
		// ����!! �� �� ���� ����� �����̶� ���� �İ� ���ǽ� ��� ������ �Ǵ±��� ! 
		
		/*
		 * �ܶ� ȸ�� �� �� �� ���� 
		 * 
		 * �� ��            �� �� 
		 * T / ���     T ������� ���X boolean ��� True 
		 *             F ������� ���X boolean ��� True 
		 *             
		 *  �� ��            �� ��
		 * F / ���      T ������� ��� boolean ��� True 
		 *              F ������� ��� boolean ��� False
		 */

	}

}
