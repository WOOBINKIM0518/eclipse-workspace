package practice;

import java.util.Scanner;

public class practice_01 {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("이름 , 나이 , 도시 , 체중 , 독신여부를 입력하세요.");
	
	String name = sc.next();
	int age = sc.nextInt();
	String city = sc.next();
	double weight = sc.nextDouble();
	boolean single = sc.nextBoolean();
	
	System.out.println("이름은" + name + " 입니다");
	System.out.println("나이는" + age + " 입니다");
	System.out.println("도시는" + city + " 입니다");
	System.out.println("체중은" + weight + " 입니다");
	System.out.println("독신여부는" + single + " 입니다");
	
	sc.close();
	
	
	}
}
