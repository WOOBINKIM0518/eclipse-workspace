package O624;

public class Loop_For_Break {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
		
		for ( num=0; ;num++) { 
			// 중간에 조건이 없으면 계속 순환 따라서 아래 if 함수 넣어주고 break;
			
			sum += num;  // sum = sum+num
			
			
			if(sum>=100)
				break;
		}
		
		System.out.println("1부터 합이 100이 넘어갈 때 숫자 : "+num);
		System.out.println("100이 넘어갈 때 그 합의 : " +sum);
		
	}

}
