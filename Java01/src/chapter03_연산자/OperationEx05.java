//관계 연산자 

package chapter03_연산자;

public class OperationEx05 {

	public static void main(String[] args) {

		int myAge =27;
		boolean value1 = (myAge > 23); // 크면 참         >=크거나 같으면 T
		
		System.out.println(value1);
		
		boolean value2 = (myAge < 23) ;  //  작으면 참       <= 작거나 같으면 T
		System.out.println(value2);
		
		
		boolean value3 = (myAge == 23);  // 두개 항의 값이 같으면 T
		System.out.println(value3);
	
		boolean value4 = (myAge  != 23);  // != 두개항이 다르면 참T
		System.out.println(value4);
	
		
		// Equal(=) 하나는 대입연산자    Equal 두개(==)면 같다는 연산자 
	}

}
