package REVIEW;

import java.util.Scanner;

public class Review_07_Ä¿ÇÇ¯“ {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
		 
		 
		 System.out.print("¾î¶² Ä¿ÇÇ¸¦ µå¸±±î¿ä? :  ");
		 
		 String order = sc.next();
		 
		 int price = 0;
		 
		 switch(order) {
		 case "¿¡½ºÇÁ·¹¼Ò" : case "Ä«ÇªÄ¡³ë" : case "Ä«Æä¶ó¶¼" :
			 price = 3500;
			 
		 case "¾Æ¸Þ¸®Ä«³ë":
			 price = 2000;	 
			 
		
		default : 
			System.out.println("ÇØ´ç ¸Þ´º´Â Á¸Àç ÇÏÁö ¾Ê½À´Ï´Ù");
						 
		 }
		 
		 System.out.println("Ä¿ÇÇ´Â"+price+"¿ø ÀÔ´Ï´Ù.");
		 
		 sc.close();
	}

}
