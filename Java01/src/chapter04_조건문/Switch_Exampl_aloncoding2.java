// p.106 _ whitch-case�� �� ȥ�� �ڵ�!  // �߰��߰� ����Ʈ

package chapter04_���ǹ�;

public class Switch_Exampl_aloncoding2 {

	public static void main(String[] args) {

		int floor =10;
		String name;
		
		switch (floor){
			case 1 : name = "�౹";
					System.out.println(floor+ "�� "+ name +" �Դϴ�.");
			break;
			
			case 2 : name = "�����ܰ�";
					System.out.println(floor+ "�� "+ name +" �Դϴ�.");
			break;
			
			case 3	: name = "�Ǻΰ�";
					System.out.println(floor+ "�� "+ name +" �Դϴ�.");
			break;
			
			case 4 : name = "ġ��";
					System.out.println(floor+ "�� "+ name +" �Դϴ�.");
			break;
			
			case 5	: name = "�ｺ Ŭ��";
					System.out.println(floor+ "�� "+ name +" �Դϴ�.");
			break;
			
			default : name = "�� �� �����̽��ϴ�.";
			System.out.println(name) ;
		}
	
	}

	
}
