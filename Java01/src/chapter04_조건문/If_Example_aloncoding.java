// ���ǹ�  else if  ���� �ѹ� ������ ����

package chapter04_���ǹ�;

public class If_Example_aloncoding {

	public static void main(String[] args) {

		int score = 50;
		char grade;
		
		if ( score >= 90 ) {
				grade = 'A';
				System.out.println(score+ " ��");  
		}
		else if (score >=80 ) { 
				grade = 'B';
				System.out.println(score+ " ��");			
		}
		else if (score >=70) {
				grade = 'C';
				System.out.println(score+ " ��");
		}
		else if (score >=60) {
				grade = 'D';
				System.out.println(score+ " ��");
		}
		else {  
				grade = 'F';
				System.out.println(score+ " ��");
		}
		
		System.out.println("������ " + grade + " �Դϴ�");
	}

}
