package constructor;

public class PersonTest {

		public static void main(String[] args) {
//			Person personLee = new Person();
			Person personKim = new Person(); // 기본생성자 호출
			
			personKim.name= "김유신";
			personKim.weight= 85.5F;
			personKim.height=180.0F;
			
			Person personLee = new Person("이순신",175,75);
			
			System.out.println("이름은  "+personKim.name+"몸무게는 "+ +personKim.weight+"키는  " +personKim.height+" 입니다.");
			System.out.println(personLee.name+personLee.height+personLee.weight);
			
			
		
		//personKim  // ctrl + spacebar 누르면 만들어놓은 객체 자동완성
		
		}
}
