package p383;

public class NewInstanceTest {

	public static void main(String[] args)throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
			Person person1 = new Person();		
					//정적로딩 : 컴파일 단계에서 체크를 한다.
					
			System.out.println(person1);
			
			Class pClass = Class.forName("p383.Person");	
			
			//동적로딩 : 컴파일 단계에서는 체크하지 않고 실행시 체크
			//pClass가 Class데이터 타입을 가진다
			//pClass를 가지고 새로운 인스턴스 생성시 형변환이 필요하다.
			Person person2 = (Person)pClass.newInstance();
			System.out.println(person2);
		}
	}


