package p407_collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
			//�����ؼ� ��� ASC(�������� ����), DES(�������� ����)
			//�ߺ��� ������ �Ͽ����� ����
		
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		
		
		
		
		treeSet.add("������");
		treeSet.add("������");
		treeSet.add("������");				//�ߺ��� ������ ��� X

		
		for (String str : treeSet) {
			System.out.println(str);
		}
	
	}

}
