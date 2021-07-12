package REVIEW;

public class Review_08_별탑만들기 {

	public static void main(String[] args) {

		int lineCount = 4;
		int spaceCount = 3;
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
			
			spaceCount -=1;
			starCount +=2;
			System.out.println();
		}
		
		
		
	}

}
