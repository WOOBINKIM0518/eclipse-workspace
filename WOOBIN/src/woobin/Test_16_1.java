package woobin;

import java.util.Scanner;

public class Test_16_1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score [] = {98,88,76,62,55};
		String name = " "; // �ʱⰪ �������� 
		int i = 0;  // �� ���⼭  i �� �ʱⰪ 0���� ���� �ؾ��ϴ°� 
		
		
		while(true) {// ���ѷ���
			  System.out.println("�����̸��� �Է��Ͻÿ� >> ");
			  name = sc.next();
			  if(name.equals("�׸�")) break;
			  for(i=0; i<course.length; i++)
				  if(course[i].equals(name)) {
					  System.out.println(course[i] + "�� ������ : "+ score[i] + "  �Դϴ�.");
					  break;
				  }
			  if ( i == course.length) { 
				  System.out.println("���� ���� �Դϴ�.");
			  }
		}sc.close();
	}
}