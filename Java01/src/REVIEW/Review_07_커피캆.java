package REVIEW;

import java.util.Scanner;

public class Review_07_Ŀ�ǯ� {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
		 
		 
		 System.out.print("� Ŀ�Ǹ� �帱���? :  ");
		 
		 String order = sc.next();
		 
		 int price = 0;
		 
		 switch(order) {
		 case "����������" : case "īǪġ��" : case "ī���" :
			 price = 3500;
			 
		 case "�Ƹ޸�ī��":
			 price = 2000;	 
			 
		
		default : 
			System.out.println("�ش� �޴��� ���� ���� �ʽ��ϴ�");
						 
		 }
		 
		 System.out.println("Ŀ�Ǵ�"+price+"�� �Դϴ�.");
		 
		 sc.close();
	}

}
