package O624;

public class Q4_bin {

	public static void main(String[] args) {

		int lineCount = 4;  
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) { // 라인을 처리하는 FOR문
			
			}
			for(int j=0; j<starCount; j++) {		// 별표  처리
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {		// 별표 오쪽에 공백 처리
				System.out.print(' ');
			}
			
			spaceCount-=1;  // spaceCount = spaceCount-1  
			starCount+=1;   //  startCount = starCount+2
			System.out.println();
		}
	}
