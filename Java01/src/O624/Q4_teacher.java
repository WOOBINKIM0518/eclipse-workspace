//���� Ǯ���� �� �������� �ľ� 

package O624;

public class Q4_teacher {

	public static void main(String[] args) {
		int lineCount = 4;   // ����� ���μ�
		int starCount = 1;   // ���� ��� �ϴ� ���� , �ʱⰪ���� 1
		int spaceCount = 0;  // ������ ó���ϴ� ����, �ʱⰪ���� 3
		
		for (int i =0 ; i < lineCount; i++) {  //�� ������ ����ش�
			
			for ( int j = 0; j <spaceCount; j++) {  // ��ǥ ���ʿ� ���� ó��
				System.out.print(' ');
			}
			for(int j = 0 ;  j < starCount ; j++) {  // ��ǥ  ó��
				System.out.print('*');
			}
			for (int j =0; j < spaceCount; j++ ) {  // ��ǥ ���ʿ� ���� ó��
				System.out.print(' ');
			}
			spaceCount -=1;  // spaceCount = spaceCount-1  
			starCount +=1;   //  startCount = starCount+2
			System.out.println();
			
		}
	}
}