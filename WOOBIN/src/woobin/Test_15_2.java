package woobin;

	public class Test_15_2 {
	    public static void main(String[] args) {
	    	int a,b;
	    	
	        for(int i = 1; i<= 99; i++) {
	        	
	        	a= i/10;
				b= i%10;
	        	
	            if(b == 3||b == 6||b == 9){  // 나머지가 3,6,9 _ 일의자리
	            	
	                if(a == 3||a == 6||a == 9)
	                    System.out.println(i + " 박수짝짝");// 에다가 10의자리가 3,6,9
	                
	               else
	                    System.out.println(i + " 박수짝");// 나머지만 3 ,6 ,9 _일의자리
	            }
	            
	            
	            else if(a == 3||a == 6||a == 9) 
	                System.out.println(i + " 박수짝");    // 10의 자릿수만  30,60,90
	        }
	    }
	}