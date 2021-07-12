// 조건문  else if

package chapter04_조건문;

public class If_Example05 {

	public static void main(String[] args) {

		int age = 7;
		int charge;
		
		if (age <8 ) {
				charge = 1000;
				System.out.println("미취학 아동 입니다.");  
				// else가 없으면 맨 밑으로 빠지는 것이 아니라 바로 밑 if로 진행
		}
		if (age < 14) { // if의 조건이 아닐때 else if 다시 조건을 넣어주어야 함
				charge = 2000;
				System.out.println("초등학생 입니다.");			
		}
		if (age <20) {
				charge = 2500;
				System.out.println("중고생 입니다.");
		}
		else {  // 마지막은 else_ 위 모든경우가 아닌 경우 이기 때문에 별도 조건 입력하지 않는다.
				charge = 3000;
				System.out.println("일반인 입니다");
		}
		
		System.out.println("입장료는 " + charge + " 입니다");
	}

}
