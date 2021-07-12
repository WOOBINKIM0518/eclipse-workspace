package woobin;

public class Test_15_1 {
	public static void main(String[] args) {
		boolean b1, b2;
		int a,b;
		
		for(int i=1; i<100; i++) {
			if (i<10) {  // 입력값이 한자리 수인 경우
				if ((i %3) == 0)
					System.out.println(i + " 박수 한번");
			}
			else {  // 입력값이 두자리 수인 경우
	        	b1 = (i/10) %3 == 0;  // 십의 자리수가 3의 배수인지 판별
	        	b2 = (i%10) %3 == 0;  // 일의 자리수가 3의 배수인지 판별
	             
	        	if ((i%10) == 0) // 예외처리. ex)30, 60, 90
	        		b2 = false;
	             
	        	if (b1 && b2)
	        		System.out.println(i + " 박수 두번");
	        	else if (b1 || b2)
	        		System.out.println(i + " 박수 한번");
	        }
		}
	}
}