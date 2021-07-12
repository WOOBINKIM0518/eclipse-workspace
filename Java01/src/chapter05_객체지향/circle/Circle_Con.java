package chapter05_객체지향.circle;

public class Circle_Con {

	int radius;
	String name;
	
	public Circle_Con(int r, String n) {  // 매개 변수를 가진 생성자
		radius = r ; name = n;}
	
	public Circle_Con() {  // <=== 생성자 ( 매개변수가 없는 생성자)
		radius = 1 ;	name =""; // radius 의 초기값은 1 	
		}
	// 생성자에는 voi d 나 return 하지 않는다 
	
	public double getArea () {
		return 3.14*radius*radius;	}
	public static void main(String[] args) {
		
		Circle_Con pizza = new Circle_Con(10, "자바피자");// <==매개변수를 가진 생성자를 호출
		
		double area = pizza.getArea();
		
		System.out.println(pizza.name+" 의 면적"
				+ "은" + area +" 입니다.");
		
		Circle_Con donut = new Circle_Con(); // <==매개변수를 가지지 않은 생성자를 호출
		donut.name = "자바 도넛";
		area = donut.getArea();
				
		System.out.println(donut.name+ " 의 면적은"+area+" 입니다.");
		
		
	}

}
