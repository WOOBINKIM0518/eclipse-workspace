package p378_class;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());	/*Class 클래스의 getName메소드
												Class의 전체이름(패키지이름.클래스이름)*/
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		/*
			정적 로딩 : 컴파일 단계에서 체크, 실행
			동적 로딩을 통한 클래스 이름을 개더링한다. 
			컴파일러가 컴파일 단계에서 체크하지 않고 실행될 때 체크 
			동적 바인딩 : 업캐스팅된 메소드를 호출할 경우 하위 객체의 재정의된 메소드로 바인딩
		*/
		
		Class pClass3 = Class.forName("p378_class.Person");		//동적로딩됨;
		System.out.println(pClass3.getName());
		
	}

}
