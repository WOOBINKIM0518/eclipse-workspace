package woobin;

public class Test_15 {

	public static void main(String[] args) {
	     for (int i = 3; i < 100; i++) {
	            int unit = i % 10; // 나머지    
	            int ten = i / 10; //  몫     
	            if (i < 10) {
	                if (i % 3 == 0)
	                    System.out.println(i + " 박수 짝");}
	            else {
	                if ((ten % 3 == 0) && (i % 10 == 0))            // 30, 60, 90
	                    System.out.println(i + " 박수 짝");
	                else if ((unit % 3 == 0) && (ten % 3 == 0))     // 일의자리, 십의자리 둘다 3의 배수
	                    System.out.println(i + " 박수 짝짝");
	                else if ((unit % 3 == 0) || (ten % 3 == 0))     // 3의 배수가 한 개
					  System.out.println(i + " 박수 짝");
	            }

	        }
	    }
	}