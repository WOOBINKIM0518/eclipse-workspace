// 06월 22일 (화) 비트 연산자 10진법수를 2진법으로 변환하고 그 변환한 수를 연산하여 결과를 얻는다.

package chapter03_연산자;

public class OperationEx08 {

	public static void main(String[] args) {

		int num1 = 10;  //  0B00000000000000000000000000001010
						//  0B11111111111111111111111111110101
		int num2 = 5;
		
		 		//int num1 = 0B00000000000000000000000000001010; = 0B1010 =10
				//int num2 = 0B00000000000000000000000000000101; = 0B0101  =5
//int result2 = num1 & num2; 0B00000000000000000000000000000000; = 0B0000  =0
//int result3 = num1 | num2; 0B00000000000000000000000000001111; = 0B1111 =15
//int result4 = num1 ^ num2; 0B00000000000000000000000000001111; = 0B1111 =15
		
		int bNum2 = 0B00000000000000000000000000000000; // = 0B0000 (0)
		int bNum3 = 0B00000000000000000000000000001111; // = 0B1111 (15)
		int bNum4 = 0B00000000000000000000000000001111; // = 0B1111 (15)
		
		int result1 = ~num1;   // ~ 비트의 반전
		int result2 = num1 & num2;  //비트 단위 AND  두 값이 모두 1 이면 1을 출력
		int result3 = num1 | num2;  //비트 단위 OR   둘 중에 하나만 1이면 1을 출력 , 둘다 0 이면 0
		int result4 = num1 ^ num2;  //비트 단위 XOR  // 두 값이 서로 다르면 1 , 같으면 0
		
				
		System.out.println(result1);
		System.out.println("ㄱ : "+result2);
		System.out.println("ㄴ : "+result3);
		System.out.println("ㄷ : "+result4);
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//System.out.println(num3);
		//System.out.println(num4);
		System.out.println("ㄱ : "+bNum2);
		System.out.println("ㄴ : "+bNum3);
		System.out.println("ㄷ : "+bNum4);
	}

}
