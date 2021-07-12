package O624;

public class Notepad2 {

	public static void main(String[] args) {
		
		int lineCount = 7;
		int spaceCount= 3;
		int starCount = 1;
		
		for(int i = 0 ; i < lineCount; i++) {
			System.out.println("  "+i);
			for (int j= 0; j < spaceCount; j++) {
			}
			for (int j = 0; j<starCount; j++) {
			}
			for (int j =0; j<spaceCount; j++) {
			}
			System.out.println(spaceCount+"/"+starCount+"/"+spaceCount);
			
			if( i < lineCount/2){
			spaceCount -=1;
			starCount +=2;
		//	System.out.println(spaceCount+"/"+starCount+"/"+spaceCount);
			}
			
			else {
			spaceCount +=1;
			starCount -=2;
			//System.out.println(spaceCount+"/"+starCount+"/"+spaceCount);			
			}
			
		}
	}

}