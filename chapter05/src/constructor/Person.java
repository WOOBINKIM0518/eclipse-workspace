package constructor;

public class Person {
	
	String name;
	float height;
	float weight;

	public Person() {};			//기본 생성자 생략가능
					//클래스 내에 다른 생성자가 있는 경우 생략 불가
	
	public Person(String pname) {
		name =pname;
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
				
	}
}
