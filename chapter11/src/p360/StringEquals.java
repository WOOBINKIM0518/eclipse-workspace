package p360;

public class StringEquals {

	public static void main(String[] args) {

		String str1 =  new String("abc");		//String Ŭ������ equal(),toString() ������
		String str2 = new String("abc");
		
		
		System.out.println(str1== str2);			// == : ��ü�� �ּ�(�ؽ���)
		System.out.println(str1.equals(str2));		// equlals : ������ (���ڿ��� ��)
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		Integer i3 = 100; // new�ؼ� �������� �ٷ� �䷸�� ����ض� 
		
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println("==================");
		System.out.println(str1);					//str1�� ��ü�� ��� �� �� ���ڿ��� ���
		System.out.println(str2);
		System.out.println("==================");
		System.out.println(i1);
		System.out.println(i2);
	}

}
