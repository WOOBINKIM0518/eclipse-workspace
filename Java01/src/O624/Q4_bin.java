package O624;

public class Q4_bin {

	public static void main(String[] args) {

		int lineCount = 4;  
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) { // ������ ó���ϴ� FOR��
			
			}
			for(int j=0; j<starCount; j++) {		// ��ǥ  ó��
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {		// ��ǥ ���ʿ� ���� ó��
				System.out.print(' ');
			}
			
			spaceCount-=1;  // spaceCount = spaceCount-1  
			starCount+=1;   //  startCount = starCount+2
			System.out.println();
		}
	}
