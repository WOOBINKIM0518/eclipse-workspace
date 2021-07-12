package chapter02_06월21일;

public class CharacterEx02 {

	public static void main(String[] args) {

		char ch1 = '한';            
		  //  '' 안에는 영어나 한글이나 한 자만 넣을 수 있음
		
		char ch2 = '\uD55C';     // 유니코드 값 (한)
		
		
		char ch3 = '\uAE00';  //(한)
		char ch4 = '\uAC38';  //(갸) 
		
		
		//char ch5 = -65;  // 음수 넣으면 오류 
		char ch6 = 65;
		
		
		System.out.println(ch1);   // '한'이라는 글자(변수)를 넣었음
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
	//	System.out.println(ch5);  // 문자형 마이너스 넣으면 오류남
		System.out.println(ch6);

		
		System.out.print(ch2);
		System.out.println(ch3);
		
		// 영어 숫자 특수문자 _ 아스키코드  : 1byte
		// 한글 일어       _ 유니코드    : 2byte
	}

}
