package woobin;

import java.util.Scanner;

public class Test_16_1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5","컴퓨터구조","안드로이드"};
		int score [] = {98,88,76,62,55};
		String name = " "; // 초기값 공백으로 
		int i = 0;  // 왜 여기서  i 를 초기값 0으로 설정 해야하는가 
		
		
		while(true) {// 무한루프
			  System.out.println("과목이름을 입력하시오 >> ");
			  name = sc.next();
			  if(name.equals("그만")) break;
			  for(i=0; i<course.length; i++)
				  if(course[i].equals(name)) {
					  System.out.println(course[i] + "의 점수는 : "+ score[i] + "  입니다.");
					  break;
				  }
			  if ( i == course.length) { 
				  System.out.println("없는 과목 입니다.");
			  }
		}sc.close();
	}
}
