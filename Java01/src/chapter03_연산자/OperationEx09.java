// ��Ʈ �̵� ������ : 

package chapter03_������;

public class OperationEx09 {

	public static void main(String[] args) {

		int num = 0B00000101;   // (5)
		
		// ���࿡ num =num <<2; �� �Ҵ��� �ϰԵǸ� �Ʒ��� �������鼭 �Ҵ�Ǿ� �ٲﰪ�� ����� 
		
			
		System.out.println(num << 2); // 0B00010100  (20) 5*2^2
		System.out.println(num << 3); // 0B00101000  (40) 5*2^3
		System.out.println(num << 4); // 0B01010000  (80) 5*2^4
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println(num >> 1); // 0000000010   (2) 5/2^1 =2.xx �������̿��� 2�� ���
		System.out.println(num >> 2); // 0B00000001   (1) 5/2^2 =1.xx �������̿��� 1�� ���
		System.out.println(num >>> 2);// 0B00000001   (1) 5/2^2 =1 
		
		//Shift �� ��� ���� num������ ���� ���� �ʴ´� _ �ٸ� �޸𸮿� �����
		// ���� ����Ǿ� ���� ���� ���� ���� �ƴ϶� ������ num ���� ����ȴ�/
		
		System.out.println(num);
						
		num = num <<2;                 //0B00010100
		
		// �Ҵ��� �ϰԵǸ� �����  but �Ҵ����� ������ ������ ������ ����� 
		
		System.out.println(num); //0B00010100
		
		//�Ҵ��ϰ� �Ǿ� �� �ǽ��� �ٽ� �Է��ϸ� ���� �޶��� 
		
		System.out.println(num <<2); //0B01010000
	}

}
