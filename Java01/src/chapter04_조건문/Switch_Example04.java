package chapter04_���ǹ�;

public class Switch_Example04 {

	public static void main(String[] args) {

		int month = 51;
		int day ;
		
		switch (month) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : 
			day  = 31;
			break;
		case 2 : 
			day = 28;
			break;
		case 4 : case 6: case 9 : case 11 :
			day = 30;
			break;
			
		default:
			day = 0;
			System.out.println("���� ���� �ʴ� ���Դϴ�.");
			return; // ���� �Է��ϸ� default ���� ��� _ �Ʒ� �� �� ��¾ȵ�
		}
		
		System.out.println(month + "���� " + day + "�� ���� �ֽ��ϴ�." );
	}

}
