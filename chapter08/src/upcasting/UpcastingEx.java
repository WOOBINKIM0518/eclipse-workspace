package upcasting;

public class UpcastingEx {
	
	public static void main(String[] args) {
		
		/*
		 * Person p; Student s = new Student("김우빈"); p = s;
		 */							//업캐스팅 : p = (Person) s; <== 업캐스팅할때는 Person 자료형을 명시하지않아도 묵시적으로 적용
		
		Person p = new Student("김우빈");  // 업캐스팅 한 줄로
		
		
		
		
		
	System.out.println(p.name);
		
		/*
		  p.grade = "A"; 
		  p.department = "HR";				//컴파일 오류 
		 
		
		p.name = "홍길동";
		p.id =  "ID";
		
		s.grade = "A";
		s.department = "HR";*/
		
	
		
		
	}
}
