package p453_innerclass;			//<<정적 내부 클래스 예제>>


class OutClass{
	private int num =10;			//외부 클래스의 인스턴스 변수			:num
	private static int sNum =20;	//외부 클래스의 정적변수	:sNum
	
	static class InStaticClass{
		int inNum =100;				//내부 클래스의 인스턴스 변수 : intNum
		static int sInNum = 200;	//내부 클래스의 정적 변수 : sInNum
		
		void inTest() {		//정적 내부 클래스의 일반 매서드 (인스턴스 메소드)
			//num +=10;		//외부 클래스의 인스턴스 변수는 사용할 수 없음
			//sNum +=10;	//외부 클래스의 static 변수는 사용 가능함
			//inNum +=10;   //내부 클래스의 인스턴스 변수 (O)
			//sInNum +=10;	//내부 클래스의 static 변수 (O)
			
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스변수 사용)"); 
			System.out.println("InStaticClass inNum = " + sInNum + "(내부 클래스의 정적변수 사용)"); 
			System.out.println("InStaticClass inNum = " + sNum + "(외부 클래스의 정적변수 사용)"); 
			//System.out.println(num); 오류 
		}
		
		static void sTest() {		//정적 내부 클래스의 static메서드, 호출 : 	<<<	인스턴스 이름 , 클래스 이름 >>>
			//num +=10;				//외부 클래스의 인스턴스 변수는 사용할 수 없음
			//inNum +=10;			//외부 클래스의 정적 변수 사용가능
			//inNum +=10;			//내부 클래스의 인스턴스 변수는 사용할 수 없음
			//sInNum +=10;			//내부 클래스의 정적 변수 사용 가능
			
			System.out.println("OutClass sNum = " + sNum + "(외부클래스의 정적 변수 사용");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부클래스의 정적 변수 사용");
			//System.out.println(num);		//외부 인스턴스 변수
			//System.out.println(inNum);	//내부 인스턴스 변수
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		
		//OutClass outclass = new OutClass(); 만들지 않아도 아래 가능
		
		// 외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass.InStaticClass sInClass =new OutClass.InStaticClass();		//외부 클래스를 생성하지 않고 내부 클래스 객체 생성
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 매서드 호출");
		OutClass.InStaticClass.sTest();										//정적 내부클래스의 정적 메소드는 클래스 이름으로  바로 호출
																			//정적 내부클래스의 정적 메소드는 인스턴스 이름으로도 호출
	}
}
