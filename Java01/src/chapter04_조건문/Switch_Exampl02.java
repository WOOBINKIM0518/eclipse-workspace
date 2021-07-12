

package chapter04_조건문;

public class Switch_Exampl02 {

	public static void main(String[] args) {

		String medal = "Gol";
		
		
		switch(medal) {
			case "Gold" : case "G" : case "Gol" :
				System.out.println("금메달 입니다.");
			break;
			
			case "Silver" : case "s" : case "Sil" :
				System.out.println("은메달 입니다.");
			break;
			
			case "Bronze" : case "B" : case "Bro" :
				System.out.println("동메달 입니다.");
			break;
			
			default : 
				System.out.println("메달이 없습니다.");
				break;
			}
				
		}
		
	}
