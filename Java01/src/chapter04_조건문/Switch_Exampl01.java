package chapter04_���ǹ�;

public class Switch_Exampl01 {

	public static void main(String[] args) {

		String medal = "Gold";
		
		switch (medal) {
		case "Gold":
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
		case "Silver":
			System.out.println("���޴� �Դϴ�");
			break;
		case "Bronze":
			System.out.println("���޴� �Դϴ�.");
			break; // �����ݷ� ���� ! 
		default:   //���� �ݷ� �ƴѰ� ���� ! 
		
			System.out.println("�޴��� �����ϴ�.");
		}
		
	}
}


//   �ڷ��� ���� = ���ͷ� �� 

//   switch (����) {
//   case (������ ��) :  <- �ݷ�
//   	 System.out.println("������ ���� ��°�");
//  	 break;    <- �����ݷ�

//	 case (������ ��) :  <- �ݷ�
//        System.out.println("������ ���� ��°�");
//        break;    <- �����ݷ�

//   default :  < - �ݷ� _ ���� ���� ���� �ƴѰ��(��ĪX) �� ������ (=else if ���� ������ else)
//        System.out.println("������ ���� ��°�");
//    }


			