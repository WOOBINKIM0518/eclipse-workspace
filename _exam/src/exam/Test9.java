package exam;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����"	, "��"};
		String User,Com;
		int n; // str�迭�� ���� 0~2�� ���� �������� �ҷ����� ���� ����
		
		System.out.println("��ǻ�Ϳ� ���� ���� ���� �մϴ�.");
		
		do {
			System.out.println("���� ���� ��!!");
			User=sc.next();
			if(User.equals("�׸�"))break;
			
			n=(int)(Math.random()*3);
			Com=str[n];
			if(User.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", �����ϴ�.");
					continue;
				}
				if(str[n].equals("����")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", ����ڰ� �����ϴ�.");
					continue;
				}
				if(str[n].equals("��")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", ����ڰ� �̰���ϴ�.");
					continue;
				}
			}
			if(User.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", ����ڰ� �̰���ϴ�.");
					continue;
				}
				if(str[n].equals("����")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", �����ϴ�.");
					continue;
				}
				if(str[n].equals("��")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", ����ڰ� �����ϴ�.");
					continue;
				}
			}
			if(User.equals("��")) {
				if(str[n].equals("����")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", ����ڰ� �����ϴ�.");
					continue;
				}
				if(str[n].equals("����")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", ����ڰ� �̰���ϴ�.");
					continue;
				}
				if(str[n].equals("��")) {
					System.out.println("����� = "+User + " , ��ǻ�� = "+ Com + ", �����ϴ�.");
					continue;
				}
			}
		}while(true);
		System.out.println("������ ���� �մϴ�.");
		sc.close();
	}
}