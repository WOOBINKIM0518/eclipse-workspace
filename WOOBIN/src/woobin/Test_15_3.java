package woobin;

public class Test_15_3 {

	public static void main(String[] args) {
		int a,b; // a = 10의 자리 , b =1의 자리
		
		for(int i = 1 ; i<100 ; i++) {
			a= i/10; // a = 0 (i:1~9) ,  a=1 (i:10~19), a=2 (i:20~29), a=3 (i:30 ~39) ...
			b= i%10; 
			
			if((a==3|| a==6 || a==9) && (b==3 ||b==6||b==9)) {  // 10자리 1의 자리 모두 3,6,9  
				System.out.println(i + "박수 짝짝");
				
			}
			else if (( a==3 || a==6 || a==9) && (b !=3||b!=6 || b!=9)) {// 10의자리 3,6,9 일의자리 3,6,9 안들어있다.
				System.out.println((i + "박수 짝"));
				
			}
			else if(( a!=3 || a!=6 ||a!=9) && (b ==3||b==6 || b==9)) {//10의자리 3,6,9안들어가 있고 1의 자리 3,6,9  
				System.out.println((i + "박수 짝"));}
			
		}
	}
}


