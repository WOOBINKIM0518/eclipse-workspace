package chapter05_객체지향.circle;

public class Person_Test {

	public static void main(String[] args) {

		Person man =new Person();
		
		man.name = "James";
		man.age = 40;
		man.inMarried = true;
		man.numberOfChildren = 3;
	
		
			System.out.println("이 사람의 나이 :" + man.name );
			System.out.println("이 사람의 이름 : "+ man.age );
			System.out.println("이 사람의 결혼 여부 :" + man.inMarried );
			System.out.println("이 사람의 자녀 수 : " + man.numberOfChildren );			
		
	}

}
