package p364_hashCode;

public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1== str2);			// == : ��ä�� �ּ�(�ؽ���)
		System.out.println(str1.equals(str2));		//equals : ������ (���ڿ��� ��)
													/*equals�� �������ߴٶ�� 
														hashCode�� ���� �������*/
		System.out.println("=======hashCode�� ����=======");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("===========================");
		
		System.out.println();
		
		System.out.println("==========�����ּҰ�==========");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println("===========================");
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
	}

}
