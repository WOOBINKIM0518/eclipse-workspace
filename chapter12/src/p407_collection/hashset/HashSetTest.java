package p407_collection.hashset;

import java.util.HashSet;			//HashSet �ߺ��� ������� �ʴ´�.

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		
		//  �ߺ��� ���� ������ �� ����.
		//  ������� ������� �ʴ´�.
		//  index�� �������� �ʴ´�.
		//  Iterator�� ����ؼ� ��� �ؾ� �Ѵ�.
		
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));		// �ߺ��� ���� ������� �ʴ´�.
		hashSet.add(new String("������"));
		
		System.out.println(hashSet);
	}

}
