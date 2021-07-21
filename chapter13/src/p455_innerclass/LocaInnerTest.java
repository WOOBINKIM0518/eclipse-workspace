package p455_innerclass;

class Outer{
	private int outNum =100;		// 인스턴수 변수 : outNum
	private static int sNum =200;	// 정적 변수		: sNum
	
	Runnable getRunnable(int i) {
		
		int num = 100;		// num final로 지정됨 , i도 final로 지정됨 
		
		class MyRunnable implements Runnable{	//지역 내부 클래스 : 메소드 내부에 존재.
			int localNum = 10;
			
			@Override
			public void run() {
				//num = 200;			//에러남. 지역변수는 상수로 바
				//i = 100;				// 에러남. 매개 변수 역시 지역변수처럼 상수로 바뀜
				//localNum = 20;		//에러가 없음 내부 클래스에서 선언된 변수
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)"	);
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적변수)");
			}
		}
		return new MyRunnable();
	}
}




public class LocaInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();	//변수의 생명주기 , run() 이 실행되면서 , getRunnable() 메서드의 변수가 사용됨

	}

}
