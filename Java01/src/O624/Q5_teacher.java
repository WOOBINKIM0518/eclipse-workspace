package O624;
public class Q5_teacher {
	public static void main(String[] args) {

		int lineCount = 7;  
		int spaceCount =3;
		int starCount = 1;
		
		for (int i =0 ; i < lineCount; i++) {  //라인을 처리 하는 FOR
			
			for ( int j = 0; j <spaceCount; j++) {  // 별표 왼쪽에 공백 처리
				System.out.print(' ');
			}
			for(int j = 0 ;  j < starCount ; j++) {  // 별표  처리
				System.out.print('*');
			}
			for (int j =0; j < spaceCount; j++ ) {  // 별표 오쪽에 공백 처리
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