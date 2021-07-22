package p465_labmda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {
	public static void main(String[] args) {
		PrintString lambdaStr = s-> System.out.println(s);	//람다식을 변수에 대입
		lambdaStr.showString("hello lamda_1");
		
		
		showMyString(lambdaStr);				//매서드 매개변수로 전달 : showMyString()메서드 호출
		
		PrintString reStr = returnString();		//retyrnString() 메서드 호출
		reStr.showString("hello");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
		public static PrintString returnString() {			//반환 값으로 사룡
			return s -> System.out.println(s+"world");
		}

}
