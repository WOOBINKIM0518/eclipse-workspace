// 명시적 형 변환

package chapter02_06월21일;

public class ExplicitConversion {

	public static void main(String[] args) {

		double dNum1 = 1.2;  // 8byte
		float fNum2 = 0.9F;  // 4byte
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		// 1.2 정수형 = 1 , 0.9F 정수형으로 = 0  SO 1+0 = 1
		
		int iNum4 = (int)(dNum1 + fNum2); 
		// 값은 2.1인데 정수형으로 변환 SO 2
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
	}

}
