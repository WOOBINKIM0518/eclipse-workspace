package REVIEW;

import java.util.Scanner;

public class Review_06_차등합격 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 점수를 입력하시오.(0~100)  ");
		int score = sc.nextInt();

		System.out.print("당신의 학년을 입력하시오.(1~4)  ");
		int year = sc.nextInt();
		
		
		if(score >=60){
			if(year !=4) {
				System.out.println("합격입니다.");}
			
			else if (score>=70) {
				System.out.println("합격입니다.");}
			
			else {
				System.out.println("불합격 입니다.");}}
			
		else 
			System.out.println("불합격 입니다.");
			
			
		sc.close();
	
	//  헤맸던 이유 _ if-else 문에서 중괄호가 생략이 가능 하지만 왠만하면 생략 말고 모두기대
		// 만약 생략할 것이라면 생략한 파트 통일 시켜야함 
	}
}