package chapter04_���ǹ�;

public class Loop_Do_While_Example {

	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		
		do {  // do �ȿ� ���� ���ǿ� ��� ���� ������ ����
			
			sum += num;    // sum = sum + num  
			num ++;
		// num �� 20�� �ִ°�� do-while ������ ������ False ���� ������ ����
		// ����                20  = 0 +  20
		//                     num ++;  ==>  21 
		// sum = 20  /  num = 21
			
			
		}while( num <= 10);  // while True�� ���� ��� �ݺ�
		
		System.out.println("1~10������ ����" + sum + "�Դϴ�.");
		System.out.println("sum : " + sum);
		System.out.println("num : " + num);
	}

}
