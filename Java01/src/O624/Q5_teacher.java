package O624;
public class Q5_teacher {
	public static void main(String[] args) {

		int lineCount = 7;  
		int spaceCount =3;
		int starCount = 1;
		
		for (int i =0 ; i < lineCount; i++) {  //������ ó�� �ϴ� FOR
			
			for ( int j = 0; j <spaceCount; j++) {  // ��ǥ ���ʿ� ���� ó��
				System.out.print(' ');
			}
			for(int j = 0 ;  j < starCount ; j++) {  // ��ǥ  ó��
				System.out.print('*');
			}
			for (int j =0; j < spaceCount; j++ ) {  // ��ǥ ���ʿ� ���� ó��
				System.out.print(' ');
			}
			
			
			if ( i< lineCount/2) {  // i = 0,1,2,
				spaceCount -= 1;
				starCount +=2;
			}
			else {
				spaceCount +=1;
				starCount -=2;
			}
			
		
			System.out.println();
		}
	}
}