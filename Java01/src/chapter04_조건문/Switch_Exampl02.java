

package chapter04_���ǹ�;

public class Switch_Exampl02 {

	public static void main(String[] args) {

		String medal = "Gol";
		
		
		switch(medal) {
			case "Gold" : case "G" : case "Gol" :
				System.out.println("�ݸ޴� �Դϴ�.");
			break;
			
			case "Silver" : case "s" : case "Sil" :
				System.out.println("���޴� �Դϴ�.");
			break;
			
			case "Bronze" : case "B" : case "Bro" :
				System.out.println("���޴� �Դϴ�.");
			break;
			
			default : 
				System.out.println("�޴��� �����ϴ�.");
				break;
			}
				
		}
		
	}
