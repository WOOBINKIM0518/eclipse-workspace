package O624;
public class Q2_teacher {
 public static void main(String[] args) {
	int dan;
	int times;
	
	for (dan=2;dan<=9;dan++) {
		if (dan %2 != 0)
			continue; // continue 하라는건 밑에 식으로 가는게 아니라 건너 뛰는거임 0이아니면 T
		for(times=1; times<=9;times++) {
			System.out.println(dan+"X"+times+"="+dan*times);
		}
			
		System.out.println();
		}
 	}
}


