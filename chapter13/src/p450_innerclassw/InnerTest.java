package p450_innerclassw;

class OutClass{
	private int num = 10;			//인스턴스 변수, new 인스턴스 생성후에만 사용
	private static int sNum = 20;	//정적 변수, new 인스턴스 생성없이 클래스이름으로사용.
	private InClass inClass;
	//InClass inClass;  // InClass의 객체형 변수를 선언, OuterClass를 생성할 때
						// InClass의 객체생성
	
	public OutClass() {
		inClass = new InClass();	//내부 클래스 생성
	}
	
	class InClass{				//인스턴스 내부 클래스(class앞에 static이 없는 클래스)
		int inNum = 100;
		//static int sInNum  = 200;		에러남 InClass에서는 Static 변수선언 안됨
		
		void inTest() {
			System.out.println("OutClass num =" + num +"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum =" + sNum +"(외부 클래스의 정적 변수)");
		}
		
		//static void sTest(){}  에러남 InClass에서는 Static 메소드도 안됨
	}
	
	
	public void usingClass() {		//내부 클래스가 Private 경우 외부에서 사용할 수 있도록 메소드
		inClass.inTest();		//내부 클래스 변수를 사용하여 매서드 호출하기
	}
}


public class InnerTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();	//내부클래스 기능 호출
		
		
		//outClass.inClass.inTest();
		//OutClass.InClass inClass = outClass.new InClass();		
		//inClass.inTest();
		//위 private InClass에서 private안들어가면 사용할 수 있음
	}

}
