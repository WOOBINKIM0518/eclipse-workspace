package example;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		//���ڿ��� ���԰����� ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();
		
		//Ű����� ���� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ��� >>  ");
			String s = sc.next();// Ű����κ��� �̸� �Է�.
			a.add(s); //ArrayList �÷��ǿ� ����
		}
		
		sc.close();
		
		//ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i =0; i<a.size(); i++) {
			//ArrayList�� i��° ���ڿ� ������
			String name = a.get(i);
			System.out.println(name + "  ");
		}
		//���� �� �̸� ���
		int longestindex = 0;
		for(int i = 0 ; i < a.size() ; i ++) {
			if(a.get(longestindex).length()<a.get(i).length())
				longestindex = i;
		}
		System.out.println("\n���� �� �̸��� : " + a.get(longestindex));
	}
}
