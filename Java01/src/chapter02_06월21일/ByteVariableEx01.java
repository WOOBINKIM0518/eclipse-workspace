// 정수의 자료형 ! 


//  byte     short     int:정수 자료형의 기본형    long   : 마지막에 L 입력(아니면 int형으로 인식)

package chapter02_06월21일;

public class ByteVariableEx01 {

	public static void main(String[] args) {

		byte num;        	// byte : 1byte (-2^7  ~ 2^7-1) , ( -128 ~ 127) 할당가능
		num = -128;
		
		byte num2;
		num2 = 127;      // 128넣으면 오류남  Type mismatch 
		
		short num3 = -32768;   //short : 2byte (-2^15  ~ 2^15-1) , ( -32,768 ~ 32,767) 할당가능
		short num4 = 32767;
		
		int num5 = -2147483648; 
		//int : 4byte (-2^31  ~ 2^31-1) , ( -2,147,483,648 ~ 2,147,483,647) 할당가능
		int num6 = 2147483647;
		//short num7 =123456789;   출력 안 됨 범위 넘어감 
		
		long num7 = -9223372036854775808L;    
		long num8 = 9223372036854775807L; //long : 8byte (-2^63  ~ 2^63-1)  
				// -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 할당가능
		
		// long형은 뒤에  L을 붙여주여야함 why 정수형으로 인식함
		//(소문자도 상관없음 but 1과 헷갈려서 대문자를 많이 씀)
		
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);

		

	}

}
