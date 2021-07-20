package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex6 {
	public static void main(String[] args) {
		//����� �̸��� ������ ����ϴ� HashMap�÷��� ����
		HashMap<String , Integer> javaScore = new HashMap <String , Integer>();
		
		//5���� ���� ����
		javaScore.put("�輺��", 97);
		javaScore.put("Ȳ����", 88);
		javaScore.put("�賲��", 98);
		javaScore.put("���繮", 70);
		javaScore.put("�ѿ���", 99);
		
		System.out.println("HashMap�� ��� ���� : " + javaScore.size());
		
		//��� ����� �������
		// javjaScore�� ��� �ִ� ���(key , value) �� ���
		//key ���ڿ��� ���� ���� Set�÷��� ����
		
		Set<String> keys = javaScore.keySet();
		
		//key ���ڿ��� ������� ������ �� �ִ� Iteratro����
		
		Iterator<String> ir = keys.iterator();
		
		while(ir.hasNext()) {
			String name = ir.next();
			int score = javaScore.get(name);
			System.out.println(name + ":"+score);
		}
		
		
	}
}