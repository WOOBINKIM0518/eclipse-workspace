// p.106 _ whitch-case�� �� ȥ�� �ڵ�! // �������� ����Ʈ

package chapter04_���ǹ�;

public class Switch_Exampl_aloncoding {

	public static void main(String[] args) {

		int floor =10;
		String name;
		
		switch (floor){
			case 1 : name = "�౹";
			break;
			
			case 2 : name = "�����ܰ�";
			break;
			
			case 3	: name = "�Ǻΰ�";
			break;
			
			case 4 : name = "ġ��";
			break;
			
			case 5	: name = "�ｺ Ŭ��";
			break;
			
			default : name = "�� �� �����̽��ϴ�.";

		}
	
			System.out.println(floor+ "�� "+ name +" �Դϴ�.");
	}

	
}
