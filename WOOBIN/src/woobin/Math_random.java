package woobin;

public class Math_random {
	public static void main(String[] args) {
		
		
		System.out.println((double)Math.random()); 		//0.xxx~0.9XXX
		System.out.println((double)Math.random()*10);  		//0~9
		System.out.println((double)Math.random()*10+1); 	//1~10
		System.out.println((double)Math.random()*100);	    //0~99
		System.out.println((double)Math.random()*100+1);	//1~100
		 
	} 
}
