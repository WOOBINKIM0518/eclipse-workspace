package practice;

import java.util.Scanner;

public class practice_01 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("�̸� , ���� , ���� , ü�� , ���ſ��θ� �Է��ϼ���.");
	
	String name = sc.next();
	int age = sc.nextInt();
	String city = sc.next();
	double weight = sc.nextDouble();
	boolean single = sc.nextBoolean();
	
	System.out.println("�̸���" + name + " �Դϴ�");
	System.out.println("���̴�" + age + " �Դϴ�");
	System.out.println("���ô�" + city + " �Դϴ�");
	System.out.println("ü����" + weight + " �Դϴ�");
	System.out.println("���ſ��δ�" + single + " �Դϴ�");
	
	sc.close();
	
	
	}
}
