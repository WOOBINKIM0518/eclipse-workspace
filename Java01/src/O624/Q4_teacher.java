//문제 풀기전 몇 라인인지 파악 

package O624;

public class Q4_teacher {

	public static void main(String[] args) {
		int lineCount = 4;   // 출력할 라인수
		int starCount = 1;   // 별을 출력 하는 변수 , 초기값으로 1
		int spaceCount = 0;  // 공백을 처리하는 변수, 초기값으로 3
		
		for (int i =0 ; i < lineCount; i++) {  //각 라인을 찍어준다
			
			for ( int j = 0; j <spaceCount; j++) {  // 별표 왼쪽에 공백 처리
				System.out.print(' ');
			}
			for(int j = 0 ;  j < starCount ; j++) {  // 별표  처리
				System.out.print('*');
			}
			for (int j =0; j < spaceCount; j++ ) {  // 별표 오쪽에 공백 처리
				System.out.print(' ');
			}
			spaceCount -=1;  // spaceCount = spaceCount-1  
			starCount +=1;   //  startCount = starCount+2
			System.out.println();
			
		}
	}
}