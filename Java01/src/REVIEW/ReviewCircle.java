/*
반지름과 이름을 가진 Circle 클래스를 작성하고, 
Circle 클래스의 객체를 생성하라. 
그리고 객체가 생성된 모습을 그려보라.
*/

package REVIEW;

public class ReviewCircle {

	int radius;
	String name;
	
	public ReviewCircle() {}
	
	public double getArea() {return 3.14*radius*radius;	}
	
	public static void main(String[] args) {
		
		ReviewCircle RC = new ReviewCircle();
		
		RC.name = "피자";
		RC.radius = 10;
		
		double area = RC.getArea();
				
		System.out.println("피자이름은"+RC.name+"  피자크기는" +RC.getArea());
	}

}
