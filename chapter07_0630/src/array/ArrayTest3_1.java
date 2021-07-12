package array;

public class ArrayTest3_1 {

	public static void main(String[] args) {

		
		char[] alphabets = new char[26];
		char ch ='A';
		
		for (int i =0 ; i<alphabets.length; i++ ,ch++) {
			alphabets[i] = ch; 			// 아스키 값으로 각 배열 방에 저장
		}
		for (int i = 0; i< alphabets.length; i++) {
			System.out.println(alphabets[i]+","+(int)alphabets[i]);
		}
	}

}
