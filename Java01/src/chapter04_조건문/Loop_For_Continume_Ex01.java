package chapter04_���ǹ�;

public class Loop_For_Continume_Ex01 {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		
		for ( num=1; num <=100; num++) {
// 		for (int total = 0; int num=1; num<=100; num++) ��� ǥ�� �Ҽ��� �ִ�
//	    but for�� �ȿ��� �����ϸ� for�� �ȿ����� �۵���
			
			if(num%2 == 0) 
//			 2�� �������� �� ���ΰ��� ¦�� ->��� �� ���� continue �� �Ʒ� �� �������� ���ƶ�
				continue;
			
			total += num; // total = totla + num
			System.out.println(total);
		}
		
		System.out.println("1���� 100������ Ȧ���� ����"+total+"�Դϴ�.");
	}

}
