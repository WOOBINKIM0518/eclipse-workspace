package inheritance2;

public class Student extends Person {

	public void set() {
		age = 30;
		name = "홍길동";
		heigth = 175;
		//weight = 99;  // Private 이라서 setter를 통해서 변수에 값을 할당
		setWeight(99);
	}
}
