// p81. 조건 연사자를 사용해보기 _ 삼항 연산자 

package chapter03_연산자;

public class Operation08 {

	public static void main(String[] args) {

		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge < motherAge) ? 'T' : 'F';
	   //              조건식          ? 결과1 : 결과 2   
		System.out.println(ch);
		
		
		int num =10;
		boolean isEven = (num%2)==0;
		System.out.println(isEven);
	}

}
