// ���ǹ�  else if  ���� �ٷ� ����

package chapter04_���ǹ�;

public class If_Example_aloncoding2 {

	public static void main(String[] args) {

		int score = 97;
		char grade;
		
		if ( score >= 90 ) {
				grade = 'A';
				// else�� ������ �� ������ ������ ���� �ƴ϶� �ٷ� �� if�� ����
		}
		else if (score >=80 ) { // if�� ������ �ƴҶ� else if �ٽ� ������ �־��־�� ��
				grade = 'B';
		}
		else if (score >=70) {
				grade = 'C';
		}
		else if (score >=60) {
				grade = 'D';
	}
		else {  // �������� else_ �� ����찡 �ƴ� ��� �̱� ������ ���� ���� �Է����� �ʴ´�.
				grade = 'F';
		}
		
		System.out.println("����� ������ " + score + " �Դϴ�." );
		System.out.println("������ "+ grade + " �Դϴ�");
	}

}
