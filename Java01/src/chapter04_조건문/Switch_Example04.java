package chapter04_조건문;

public class Switch_Example04 {

	public static void main(String[] args) {

		int month = 51;
		int day ;
		
		switch (month) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : 
			day  = 31;
			break;
		case 2 : 
			day = 28;
			break;
		case 4 : case 6: case 9 : case 11 :
			day = 30;
			break;
			
		default:
			day = 0;
			System.out.println("존재 하지 않는 달입니다.");
			return; // 리턴 입력하면 default 값만 출력 _ 아래 월 일 출력안됨
		}
		
		System.out.println(month + "월은 " + day + "일 까지 있습니다." );
	}

}
