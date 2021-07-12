package chapter02_06월21일;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;   
		int iNum = bNum;  
		
		System.out.println(bNum);  // byte 는 1byte  
		System.out.println(iNum);  // int  는 4byte  
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);   
		// int는  4byte  정수형 데이터 형식
		System.out.println(fNum);   
		// float는 4byte  실수형 데이터 형식 SO 뒤에 .0 붙었음
		
		double dNum;
		dNum = fNum + iNum;   
		// float(20.0)형식 + int(10)형식 = double 형식으로 출력
		// 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우 or 작은 수 에서 큰 수로 
		System.out.println(dNum);
		
	}

}
