
/*
너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 너비(width)와 높이(height) 
필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 Rectangle 클래스를 만들어 활용하라. 
*/

package REVIEW;

import java.util.Scanner;

public class ReviewRectnagle {
	
	int height;
	int width;
	
	public ReviewRectnagle(){}  // 생성자 
	
	public int getArea() { return height*width;}
	
	public static void main(String[] args) {
		
		ReviewRectnagle RR = new ReviewRectnagle();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 두개 입력하세요 >>   ");
		
		RR.height = sc.nextInt();
		RR.width = sc.nextInt();
		
		sc.close();
		System.out.println("사각형의 넓이는 " + RR.getArea());
	}
}

	