package chapter02;

public class Constant {

	public static void main(String[] args) {

		final int MAX_NUM = 100; // ��� ����� ���ÿ� �� �Ҵ�
		int max_Num = 100;
		final int MIN_NUM;  // �������
		
		MIN_NUM = 0;   // ����� �� �Ҵ�
	
		//MAX_NUM=1000; �����߻� WHY ?  ������ �ʴ� ��� final�� ��� �߱� ����
		// ����� �ٸ����� ���� �� ����
		
		max_Num = 200;  // int���� ���� �̱� ������ ������ 100�̶�� ���� �Ҵ��ص�
						// �ؿ��� 200���� �����ϸ� ������ ���� ����� ! 
						// ����� ������ ���� ū ������ !! ����� ��
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		System.out.println(max_Num);
	

	}

}
