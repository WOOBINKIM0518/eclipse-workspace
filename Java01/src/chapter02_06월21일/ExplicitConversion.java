// ����� �� ��ȯ

package chapter02_06��21��;

public class ExplicitConversion {

	public static void main(String[] args) {

		double dNum1 = 1.2;  // 8byte
		float fNum2 = 0.9F;  // 4byte
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		// 1.2 ������ = 1 , 0.9F ���������� = 0  SO 1+0 = 1
		
		int iNum4 = (int)(dNum1 + fNum2); 
		// ���� 2.1�ε� ���������� ��ȯ SO 2
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		
	}

}
