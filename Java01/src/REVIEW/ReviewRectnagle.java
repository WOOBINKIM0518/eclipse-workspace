
/*
�ʺ�� ���̸� �Է� �޾� �簢���� ���� ����ϴ� ���α׷��� �ۼ��϶�. �ʺ�(width)�� ����(height) 
�ʵ�, �׸��� ���� ���� �����ϴ� getArea() �޼ҵ带 ���� Rectangle Ŭ������ ����� Ȱ���϶�. 
*/

package REVIEW;

import java.util.Scanner;

public class ReviewRectnagle {
	
	int height;
	int width;
	
	public ReviewRectnagle(){}  // ������ 
	
	public int getArea() { return height*width;}
	
	public static void main(String[] args) {
		
		ReviewRectnagle RR = new ReviewRectnagle();
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �ΰ� �Է��ϼ��� >>   ");
		
		RR.height = sc.nextInt();
		RR.width = sc.nextInt();
		
		sc.close();
		System.out.println("�簢���� ���̴� " + RR.getArea());
	}
}

	