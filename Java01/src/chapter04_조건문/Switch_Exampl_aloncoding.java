// p.106 _ whitch-case문 나 혼자 코딩! // 마지막에 프린트

package chapter04_조건문;

public class Switch_Exampl_aloncoding {

	public static void main(String[] args) {

		int floor =10;
		String name;
		
		switch (floor){
			case 1 : name = "약국";
			break;
			
			case 2 : name = "정형외과";
			break;
			
			case 3	: name = "피부과";
			break;
			
			case 4 : name = "치과";
			break;
			
			case 5	: name = "헬스 클럽";
			break;
			
			default : name = "잘 못 누르셨습니다.";

		}
	
			System.out.println(floor+ "층 "+ name +" 입니다.");
	}

	
}
