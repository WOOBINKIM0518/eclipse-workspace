package array;

public class ArrayTest {

	public static void main(String[] args) {
		int[]num = new int[] {1,2,3,4,5,6,7,8,9,10}; // num배열 개체
	
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		System.out.println();
		System.out.println(num[0]);
		System.out.println(num.length);
	}
}
