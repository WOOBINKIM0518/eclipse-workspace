package REVIEW;

import java.util.Scanner;

public class Review_01_�̸�����ü�� {

	 public static void main(String[] args) {
		
		 System.out.println("�̸� , ���� , ���� , ü�� , ���ſ��� ");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 String name = scanner.next();  // ���ڿ� �б�
		 System.out.println("�̸���" +  name);
		 
		 String city = scanner.next();
		 System.out.println("���ô�"+city);
		 
		 int age = scanner.nextInt();
		 System.out.println("���̴�"+ age);
		 
		 double weight = scanner.nextDouble();
		 System.out.println("ü����");
		 
		 boolean single = scanner.nextBoolean();
		 System.out.println("���ſ��δ�"+single);
		 
		 scanner.close();
		 
		 
		 
		 
	}
}
