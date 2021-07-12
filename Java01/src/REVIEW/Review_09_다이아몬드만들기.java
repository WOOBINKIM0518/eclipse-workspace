package REVIEW;

public class Review_09_다이아몬드만들기 {

	public static void main(String[] args) {
		int lineCount = 7;
		int spaceCount =3;
		int starCount = 1;
		
		for (int i = 0; i <lineCount; i++ ) {
			for(int j =0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j =0 ; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j =0; j< spaceCount; j++) {
				System.out.print(' ');
			}
			
		if (i<lineCount/2)	{
			spaceCount -=1;
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
