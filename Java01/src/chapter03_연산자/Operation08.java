// p81. ���� �����ڸ� ����غ��� _ ���� ������ 

package chapter03_������;

public class Operation08 {

	public static void main(String[] args) {

		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge < motherAge) ? 'T' : 'F';
	   //              ���ǽ�          ? ���1 : ��� 2   
		System.out.println(ch);
		
		
		int num =10;
		boolean isEven = (num%2)==0;
		System.out.println(isEven);
	}

}
