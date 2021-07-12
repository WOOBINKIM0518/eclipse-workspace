package REVIEW;

import java.util.Scanner;

public class Review_05_학점매기기 {

	public static void main(String[] args) {
		
		char grade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 점수를 입력 하세요 (0~100)");
		
		int score = sc.nextInt();
		
		if(score>=90) {
			grade = 'A';		
		}
		else if(score>=80) {
			grade = 'B';		
		}
		else if(score>=70) {
			grade = 'C';		
		}
		else if(score>=60) {
			grade = 'D';		
		}
		else {
			grade = 'F';
		}
		
		System.out.println("당신의 점수는 "+score+" 당신의 학점은"+grade+"입니다");
		
		sc.close();
	}
}
