package chapter04_조건문;

public class Switch_Exampl01 {

	public static void main(String[] args) {

		String medal = "Gold";
		
		switch (medal) {
		case "Gold":
			System.out.println("금메달 입니다.");
			break;
		case "Silver":
			System.out.println("은메달 입니다");
			break;
		case "Bronze":
			System.out.println("동메달 입니다.");
			break; // 세미콜론 주의 ! 
		default:   //세미 콜론 아닌거 주의 ! 
		
			System.out.println("메달이 없습니다.");
		}
		
	}
}


//   자료형 변수 = 리터럴 값 

//   switch (변수) {
//   case (변수의 값) :  <- 콜론
//   	 System.out.println("변수에 대한 출력값");
//  	 break;    <- 세미콜론

//	 case (변수의 값) :  <- 콜론
//        System.out.println("변수에 대한 출력값");
//        break;    <- 세미콜론

//   default :  < - 콜론 _ 위의 변수 값이 아닌경우(매칭X) 즉 마지막 (=else if 에서 마지막 else)
//        System.out.println("변수에 대한 출력값");
//    }


			