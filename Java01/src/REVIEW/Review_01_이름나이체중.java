package REVIEW;

import java.util.Scanner;

public class Review_01_이름나이체중 {

	 public static void main(String[] args) {
		
		 System.out.println("이름 , 도시 , 나이 , 체중 , 독신여부 ");
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 String name = scanner.next();  // 문자열 읽기
		 System.out.println("이름은" +  name);
		 
		 String city = scanner.next();
		 System.out.println("도시는"+city);
		 
		 int age = scanner.nextInt();
		 System.out.println("나이는"+ age);
		 
		 double weight = scanner.nextDouble();
		 System.out.println("체중은");
		 
		 boolean single = scanner.nextBoolean();
		 System.out.println("독신여부는"+single);
		 
		 scanner.close();
		 
		 
		 
		 
	}
}
