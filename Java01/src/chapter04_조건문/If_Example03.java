/// 조건문  if / else

package chapter04_조건문;

public class If_Example03 {

	public static void main(String[] args) {

		int age = 7;
		
		if(age >= 8 ) { // 조건이 참일 때 {수행문} 실행
			
			System.out.println("학교에 다닙니다.");
		}
		
		else {     // 조건이 거진인 경우 else{수행문} 실행  else 는 별도 조건 넣어주지 않음
		
			System.out.println("학교에 다니지 않습니다.");
			
		}
				
				
	}

}
