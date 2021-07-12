package chapter05_객체지향;

public class Circle { //클래스 이름
	int radius;		//원의 반지름 
	String name;	// 원의 이름
	Circle pizza ;
	public Circle() {}  // Circle 클래스의 기본 생성자( 클래스 이름과 동일한 매서드 => 생성자)
	// 인풋 매개변수도 없고, 실행부({중괄호안})가 없는 생성자 => 기본 생성자 _ 기본생성자는 생략이 가능
	
	public double getArea() {
		return 3.14 * radius *radius;
	}
	
	public static void main(String[] args) {
		Circle pizza ;
		pizza = new Circle();		//Circle 객체를 생성해라, 레퍼런스 이름 pizza
		pizza.radius = 10; //피자의 반지르믕ㄹ 10으로 설정
		pizza.name = "자바피자"; // 피자의 이름을 설정
		double area = pizza.getArea(); // 피자의 면적(getArea()를 호출 해서 area변수에 할당)
				
		System.out.println("피자의 이름은 "+pizza.name+ "반지름은"+pizza.radius+"입니다.");
		System.out.println("피자의 면적은"+pizza.getArea());
		
		
		
		
		Circle donut = new Circle(); // Circle 객체 생성, 레퍼런스 이름 donut
		donut.radius = 2;
		donut.name = "자바도넛";
		area = +donut.getArea(); // 위에선 앞에 double 붙는데 여긴 왜 안붙지 ?>   바로 위에서 선언되어서 안써도 된다고함
		
		System.out.println("도넛의 이름은 "+donut.name+ "반지름은"+donut.radius+"입니다.");
		System.out.println("도넛의 면적은" +donut.getArea());
		
			
		
	}

}
