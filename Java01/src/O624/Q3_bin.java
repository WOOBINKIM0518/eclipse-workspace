package O624;
public class Q3_bin {
 public static void main(String[] args) {
	
	 
	int dan;
	int times;
	
	for (dan=2;dan<=9;dan++) {
		for(times=1; times<=9;times++) {
			
			if(dan+1==times)
				
				break;
			System.out.println(dan+"X"+times+"="+dan*times);
		}
		System.out.println();
	}
			
		
		}
 	}
