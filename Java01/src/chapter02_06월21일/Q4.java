package chapter02_06월21일;

public class Q4 {

	public static void main(String[] args) {

		int i  = 10;   //  정수형
		double j = 2.0;  // 실수형
		
		
		System.out.println(i+j); // 암시적(묵시적) 변환
		 // 덜세밀한 것에서 더 세밀한 것으로 변환되어 출력됨
	
		
		System.out.println((int)(i+j));  // 명시적 형변환
		System.out.println((int)(i-j));
		System.out.println((int)(i*j));
		System.out.println((int)(i/j));
	}

}
