package finalex;

public class Constant {

	int num =10;
	int nUM =20;
	int nUm =30;
	final int NUM = 100;		//상수 
	
	public static void main(String[] args) {
	
		Constant cons = new Constant();
		cons.num = 50;
	//	cons.NUM = 200; final 때문에 오류  상수이므로 값을 할당할 수 없다.
		
		System.out.println(cons.num);
		System.out.println(cons.NUM);
		System.out.println(cons.nUM);
		System.out.println(cons.nUm);
		
	}
}
