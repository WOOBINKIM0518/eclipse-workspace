package chapter02_06월21일;

public class CharacterEx01 {

	public static void main(String[] args) {

		char ch1 = 'A';   // 작은 따움표 넣는다 주의 !!
		System.out.println(ch1);        // A 라는 문자 출력
		System.out.println((int)ch1);   //  A라는 글자의 아스키코드값이 출력됨  인코딩
		
		
		char ch2 = 66;
		System.out.println(ch2);   
		//  문자열 자리에 숫자 넣으면 그 숫자(아스키코드값)의 문자 나옴 = 디코딩
		
		
		int ch3 = 67;
		System.out.println(ch3);       // 정수 출력
		System.out.println((char)ch3);  // 해당 정수의 문자값 출력됨 디코딩 !
		
	}

}

