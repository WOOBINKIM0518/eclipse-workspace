// Switch ���� If ~~ else if������ ��ȯ�ϱ�

package chapter04_���ǹ�;

public class Switch_Exampl02_ {

	public static void main(String[] args) {

	String medal = "G";
	
	if (medal == "G" || medal == "Gold" || medal == "Gol") {
		System.out.println("�ݸ޴� �Դϴ�.");
	}
	
	else if (medal == "S" || medal == "Silver" || medal == "Sil") {
		System.out.println("���޴� �Դϴ�.");
	}
	
	else if (medal == "B" || medal == "Bronze" || medal == "Bro") {
		System.out.println("���޴� �Դϴ�.");
	}
	
	else {
		System.out.println("�޴��� �����ϴ�.");
	}
	
	
	
	
	
	
	
	}
}

		
			
		/*
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
				*/
