package REVIEW;

import java.util.Scanner;

public class Review_02_시간구하기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력 하세요.");
		
		int time = sc.nextInt();
		
		int second = time%60;  // 초를 나누면 몫은 분 나머지는 초
		int minute = (time%60)%60; // 초를 나누고 또 나누면 몫은 시간 나머지는 분
		int hour = (time/60)/60; // 
		
		
		System.out.println(time + " 초는");
		System.out.println(hour + " 시간");
		System.out.println(minute + " 분");
		System.out.println(second + " 초 입니다");

		sc.close();
	
	}

}
