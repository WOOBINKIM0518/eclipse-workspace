package inheritance2;

public class inheritanceEx {

	public static void main(String[] args) {

		Student s = new Student();  // 객체 생성
		s.set();  // Student 메서드 호출
		
		System.out.println(s.age);
		System.out.println(s.name);
		System.out.println(s.getWeight()); // privatye , getter를 통해서 변수의 값 출력
		System.out.println(s.heigth);
	}

}
