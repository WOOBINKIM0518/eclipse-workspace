// ���ǹ�  else if

package chapter04_���ǹ�;

public class If_Example04 {

	public static void main(String[] args) {

		int age = 9;
		int charge;
		
		if (age <8 ) {
				charge = 1000;
				System.out.println("������ �Ƶ� �Դϴ�.");
		}
		else if (age < 14) { // if�� ������ �ƴҶ� else if �ٽ� ������ �־��־�� ��
				charge = 2000;
				System.out.println("�ʵ��л� �Դϴ�.");			
		}
		else if (age <20) {
				charge = 2500;
				System.out.println("�߰�� �Դϴ�.");
		}
		else {  // �������� else_ �� ����찡 �ƴ� ��� �̱� ������ ���� ���� �Է����� �ʴ´�.
				charge = 3000;
				System.out.println("�Ϲ��� �Դϴ�");
		}
		
		System.out.println("������ " + charge + " �Դϴ�");
	}

}
