package chapter02_06��21��;

public class CharacterEx02 {

	public static void main(String[] args) {

		char ch1 = '��';            
		  //  '' �ȿ��� ��� �ѱ��̳� �� �ڸ� ���� �� ����
		
		char ch2 = '\uD55C';     // �����ڵ� �� (��)
		
		
		char ch3 = '\uAE00';  //(��)
		char ch4 = '\uAC38';  //(��) 
		
		
		//char ch5 = -65;  // ���� ������ ���� 
		char ch6 = 65;
		
		
		System.out.println(ch1);   // '��'�̶�� ����(����)�� �־���
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	//	System.out.println(ch5);  // ������ ���̳ʽ� ������ ������
		System.out.println(ch6);

		
		System.out.print(ch2);
		System.out.println(ch3);
		
		// ���� ���� Ư������ _ �ƽ�Ű�ڵ�  : 1byte
		// �ѱ� �Ͼ�       _ �����ڵ�    : 2byte
	}

}
