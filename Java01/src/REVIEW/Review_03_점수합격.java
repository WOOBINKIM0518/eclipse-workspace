package REVIEW;

import java.util.Scanner;

public class Review_03_점수합격 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		int score = sc.nextInt();
		
		if(score>=80) {
			System.out.println("합격 입니다.");
		}
		
		else {
			 System.out.println("불합격 입니다.");
		}
	
		sc.close();
		
	}

}
