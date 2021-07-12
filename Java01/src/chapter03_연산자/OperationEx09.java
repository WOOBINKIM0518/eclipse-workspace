// 비트 이동 연산자 : 

package chapter03_연산자;

public class OperationEx09 {

	public static void main(String[] args) {

		int num = 0B00000101;   // (5)
		
		// 만약에 num =num <<2; 로 할당을 하게되면 아래로 내려가면서 할당되어 바뀐값이 적용됨 
		
			
		System.out.println(num << 2); // 0B00010100  (20) 5*2^2
		System.out.println(num << 3); // 0B00101000  (40) 5*2^3
		System.out.println(num << 4); // 0B01010000  (80) 5*2^4
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println(num >> 1); // 0000000010   (2) 5/2^1 =2.xx 정수형이여서 2만 출력
		System.out.println(num >> 2); // 0B00000001   (1) 5/2^2 =1.xx 정수형이여서 1만 출력
		System.out.println(num >>> 2);// 0B00000001   (1) 5/2^2 =1 
		
		//Shift 한 결과 값이 num변수에 저장 되지 않는다 _ 다른 메모리에 저장됨
		// 따라서 적용되어 지는 값이 들어가는 것이 아니라 최초의 num 값이 적용된다/
		
		System.out.println(num);
						
		num = num <<2;                 //0B00010100
		
		// 할당을 하게되면 적용됨  but 할당하지 않으면 별도의 공간에 적용됨 
		
		System.out.println(num); //0B00010100
		
		//할당하게 되어 위 의식을 다시 입력하면 값이 달라짐 
		
		System.out.println(num <<2); //0B01010000
	}

}
